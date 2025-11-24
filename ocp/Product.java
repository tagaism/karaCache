package ocp;

import java.util.List;
import java.util.stream.Stream;

public class Product {
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}

interface Specification<T> {
    boolean isSatisfied(T item);
}

interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> spec);
}

class ColorSpecification implements Specification<Product> {
    private final Color color;
    
    public ColorSpecification(Color color) {
        this.color = color;
    }
    
    @Override
    public boolean isSatisfied(Product item) {
        return this.color == item.color;
    }
}

class SizeSpecification implements Specification<Product> {
    private final  Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.size == item.size;
    }
}

class AndSpecification implements Specification<Product> {
    private final Size size;
    private final Color color;

    public AndSpecification(Size size, Color color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.size == item.size && this.color == item.color;
    }
    
}

class BetterFiler implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}

class ProductFilter {
    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.size == size);
    }

    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.color == color);
    }

    public Stream<Product> filterByColorAndBySize(List<Product> products, Color color, Size size) {
        return products.stream().filter(p -> p.color == color &&p.size == size);
    }
}
