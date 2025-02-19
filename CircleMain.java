//calculate circumference of the circle (2*pi*r)


import java.util.Scanner;
public class CircleMain {

   static class Circumference{
        private double r ;

        Scanner sc = new Scanner(System.in);
        public void getData(){
            System.out.println("Enter the Radius of the circle");
             r = sc.nextDouble();
        }

        public double calculate(){
            return 2 * Math.PI * r;
        }
        public void displayData(){
            System.out.println("Circumference of the circle is " + calculate());
        }

    }

    public static void main (String[] args){
        Circumference cir = new Circumference();
        cir.getData();
        cir.calculate();
        cir.displayData();
    }
}
