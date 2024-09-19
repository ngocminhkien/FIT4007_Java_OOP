public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double Area() {
        return this.height * this.width;
    }

    public double Perimeter() {
        return (this.width + this.height) * 2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle [Height=" + this.height + ", Width=" + this.width + ", Area=" + this.Area() + ", Perimeter=" + this.Perimeter() + "]";
    }
}
