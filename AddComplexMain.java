//Write ooj to fond the addition of complex no.

import java.util.Scanner;
public class AddComplexMain {
    static class Complex{
        private double real;
        private double img;
        Scanner sc = new Scanner(System.in);
        public void getData(){
            System.out.println("Enter the real and imaginary part of the complex no.");
            real = sc.nextDouble();
            img = sc.nextDouble();
        }
        public void calculate(Complex a , Complex b){
            real = a.real + b.real;
            img = a.img + b.img;
        }
        public void display(){
            if (img >= 0) {
                System.out.println("The sum of the two Complex no. are " + real + " + " + img + "i");
            }else{
                System.out.println("The sum of the two Complex no. are " + real + " - " + img + "i");
            }
        }
    }
    public static void main(String[] args){
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        c1.getData();
        c2.getData();
        c3.calculate(c1,c2);
        c3.display();
    }
}