import point.MoveablePoint;
import point.Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 8);
        System.out.println(point.toString());
        MoveablePoint moveablePoint = new MoveablePoint(8, 8, 10, 10);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
        System.out.println(Arrays.toString(moveablePoint.getXY()));
    }
}
