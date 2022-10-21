package geometry;

public class Point {
    private int x;
    private int y;
    private boolean selected;

    public Point(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public double distance(int x, int y){
        double d;
        int dx = this.x - x;
        int dy = this.y - y;
        return d = Math.sqrt(Math.sqrt(dx*dx + dy*dy));
    }
}