//Calculate Euclidean distance between two points p(x1,y1) and p2(x2,y2)
import java.util.*;
public class EuclideanDistanceMain {
    static class Distance {
        private double x;
        private double y;
        Scanner sc = new Scanner(System.in);

        public void getData() {
            x = sc.nextDouble();
            y = sc.nextDouble();
        }
    }
        public static double calculate(double x1, double x2, double y1, double y2) {
           return (Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));
        }

    public static void main (String[] args){
    Distance p1 = new Distance ();
    Distance p2 = new Distance ();

    p1.getData();
    p2.getData();

        System.out.println(calculate(p1.x,p2.x,p1.y,p2.y));
    }
}
