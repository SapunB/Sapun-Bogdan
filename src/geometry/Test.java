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
    }
}