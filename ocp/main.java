package ocp;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Product p1 = new Product("Dendy", Color.RED, Size.MIDDLE);
        Product p2 = new Product("Octopus", Color.RED, Size.MIDDLE);
        Product p3 = new Product("PS 2", Color.GREEN, Size.HUGE);
        Product p4 = new Product("xbox", Color.GREEN, Size.HUGE);
        Product p5 = new Product("Dendy", Color.BLUE, Size.SMALL);
        Product p6 = new Product("Sega", Color.BLUE, Size.SMALL);

        List<Product> products = List.of(p1, p2, p3, p4, p5, p6);

        ProductFilter filter = new ProductFilter();
        System.out.println("REDS: ");
        filter.filterByColor(products, Color.RED).forEach(p -> {
            System.out.printf("Name: %s - %s. \n", p.name, p.color);
        });
        System.out.println("BLUES: ");
        filter.filterByColor(products, Color.BLUE).forEach(p -> {
            System.out.printf("Name: %s - %s. \n", p.name, p.color);
        });
        System.out.println("BLUES & Small: ");
        filter.filterByColorAndBySize(products, Color.BLUE, Size.SMALL).forEach(p -> {
            System.out.printf("Name: %s - %s & %s. \n", p.name, p.color, p.size);
        });

        System.out.println(new ColorSpecification(Color.BLUE).isSatisfied(p4));
        System.out.println(new SizeSpecification(Size.MIDDLE).isSatisfied(p2));
        
        System.out.println("--------------------refactored to OCP----------------");

        BetterFiler bf = new BetterFiler();
        System.out.println("BF REDS: ");
        bf.filter(products, new ColorSpecification(Color.RED)).forEach(p -> {
            System.out.printf("Name: %s - %s. \n", p.name, p.color);
        });
        
        System.out.println("AND FILTER;");
        bf.filter(products, new AndSpecification(Size.HUGE, Color.GREEN)).forEach(p -> {
            System.out.printf("Name: %s - %s. \n", p.name, p.color);
        });
    }
}
