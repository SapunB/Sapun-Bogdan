package geometry;

public class Line {
    Point startPoint = new Point();
    Point endPoint = new Point();
    boolean selected; //komentarneki

    public double length(){
        return startPoint.distance(endPoint.getX(), endPoint.getY());
    }

    public Line(){

    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}