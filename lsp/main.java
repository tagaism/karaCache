package lsp;

public class main {
    public static void useIt(Rectangle rec) {
        int width = rec.getWidth();
        rec.setWidth(10);
        System.out.println(rec.getArea());
        System.out.println(rec.getHeight() * rec.getWidth());
    }
    public static void main(String[] args) {
        Rectangle recc = new Rectangle(4, 3);
        useIt(recc);

        Rectangle sq = new Square(5);
        useIt(sq);
    }
}
