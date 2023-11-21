import java.util.*;
import java.lang.Math;

class Dist {
    double x1, x2, y1, y2;

    Dist(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distFor(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Dist d1 = new Dist(x1, y1, x2, y2);
        System.out.println("The distance is " + d1.distFor(x1, y1, x2, y2));

    }

}
