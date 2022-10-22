package geometry;

public class Test {
    public static void Test(String[] args) {
        Line line = new Line();
        line.getStartPoint().setX(5);
        line.getStartPoint().setY(6);
        line.getEndPoint().setX(10);
        line.getEndPoint().setY(12);
        Point sp = line.getStartPoint();
        Point ep = line.getEndPoint();

        System.out.println(sp.distance(ep.getX(), ep.getY()));

        Circle circle = new Circle();
        circle.getCenter().setX(5);
        circle.getCenter().setY(2);
        circle.setR(3);
        double a = circle.CircleArea();
        double b = circle.CircleCircumference();

        Rectangle rectangle = new Rectangle();
        rectangle.setA(2);
        rectangle.setB(3);
        rectangle.getUpperleft().setX(5);
        rectangle.getUpperleft().setY(3);
        double a1 = Rectangle.RectangleArea();
        double b1 = Rectangle.RectangleCircumference();
    }

}