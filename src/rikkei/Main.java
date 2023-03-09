package rikkei;

public class Main {
    public static void main(String[] args) {
     MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint.setXY(1,2);
        System.out.println(movablePoint);

        movablePoint.setSpeed(2,3);
        System.out.println( "x,y khi chua thay doi toc do " + movablePoint);
        movablePoint.move();
        System.out.println("x,y sau khi thay doi toc do" + movablePoint);


    }
}
