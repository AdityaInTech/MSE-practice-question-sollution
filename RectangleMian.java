// calculate area perimeter of rectangle
import java.util.Scanner;
public class RectangleMian {
    static class Rectangle {
        private double l;
        private double b;
        Scanner sc = new Scanner(System.in);
        public void getData() {
            System.out.println("Enter the length and breadth of the rectangle");
            l = sc.nextDouble();
            b = sc.nextDouble();
        }
        public double calculateArea() {
            return l * b;
        }
        public double calculatePerimeter() {
            return 2 * (l + b);
        }
        public void display() {
            System.out.println("Area of the Rectangle is " + calculateArea());
            System.out.println("Perimeter of the Rectangle is " + calculatePerimeter());
        }
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getData();
        r.display();
    }}

