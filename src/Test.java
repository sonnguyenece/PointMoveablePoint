public class Test {
    public static void main(String[] args) {
        Point point=new Point(5,5);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(5.5f,5.5f,1,1);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);

        movablePoint.setSpeed(3.5f,4.5f);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
