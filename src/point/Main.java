package point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(5, 5);
        MovablePoint movablePoint1 = new MovablePoint(point1.getXPos(), point1.getYPos(), 3, 5);
        System.out.println(movablePoint1.toString());
        movablePoint1.move();
        System.out.println(movablePoint1.toString());
        movablePoint1.move();
        System.out.println(movablePoint1.toString());
    }
}
