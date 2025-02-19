// OOJ to find total distance by adding tw distances specified in feet and inches
import java.util.*;
public class TotalDistance {
    static class Distance{
        private int feet;
        private int inch;
        Scanner sc = new Scanner(System.in);

        public void getData(){
            System.out.println("Enter the distance in feet and inches :");
            feet = sc.nextInt();
            inch = sc.nextInt();
        }
         public void convert(){
            if (inch >= 12){
                feet +=  (inch/12);
                inch = inch%12;
            }
        }
        public void calculate(Distance a , Distance b){
            feet = a.feet + b.feet;
            inch = a.inch + b.inch;
        }
        public void display(){
            System.out.println("The sum of two distance is ; in feet = "+feet+" and in inch = "+ inch);
        }
    }
    public static void main(String[] args){
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance d3 = new Distance();

        d1.getData();
        d2.getData();

        d3.calculate(d1,d2);
        d3.convert();
        d3.display();
    }
}
