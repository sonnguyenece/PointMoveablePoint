public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        float[] getXY = {this.x, this.y};
        return getXY;
    }

    @Override
    public String toString() {
        return "(" +
                + x + ","
                + y +
                ')';
    }
}