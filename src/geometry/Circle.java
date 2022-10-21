package geometry;

public class Circle {
    private Point center;
    private int r;
    private boolean selected;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public double CircleArea(){
        return Math.pow(this.r, 2)*Math.PI;
    }

    public double CircleCircumference(){
        return 2*this.r*Math.PI;
    }
}
