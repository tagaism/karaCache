package lsp;

public class Rectangle {
    protected int width, height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return  this.width;
    }

    public int getHeight() {
        return  this.height;
    }

    public int getArea() {
        return this.height * this.width;
    }
}
