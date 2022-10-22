package geometry;

public class Rectangle {
    private Point upperleft;
    private int a;
    private int b;

    public double RectangleArea() {
        return this.a * this.b;
    }

    public double RectangleCircumference() {
        return 2 * (this.a + this.b);
    }

    public Point getUpperleft() {
        return upperleft;
    }

    public void setUpperleft(Point upperleft) {
        this.upperleft = upperleft;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
