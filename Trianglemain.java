//calculate area , perimeter of rectangle

import java.util.*;
public class Trianglemain {
    static  class Triangle{
        private double a;
        private double b;
        private double c;
        Scanner sc = new Scanner (System.in);
        public void getData(){
            System.out.println("Enter the 3 sides (a,b,c) of the triangle");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        }

        public double calculateArea(){
           double s = (a+b+c)/2;
          return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public double calculatePerimeter(){
            return a + b + c;
        }

        public void display(){
            System.out.println("Area of the Triangle is " +calculateArea());
            System.out.println("Perimeter of the triangle is " +calculatePerimeter());
        }

    }
    public static void main(String[] args){
        Triangle t = new Triangle();
        t.getData();
        t.display();

    }
}
