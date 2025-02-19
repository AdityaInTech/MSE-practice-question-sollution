//calculate volume of surface area of a box
//calculate volume and surface area of a cylinder
//calculate volume of sphere
//calculate volume of sphere, cube and cylinder by using three methods with same name volume

import java.util.*;
public class VolumeAndSurfaceAreaMain {
    static class SurfaceArea{
        private double l;
        private double w;
        private double h;
        private double r;
        private double b;
        private double c;
        Scanner sc = new Scanner(System.in);
        public void getDataForBox(){
            System.out.println("Enter length width and height of the box");
            l = sc.nextDouble();
            w = sc.nextDouble();
            h = sc.nextDouble();
        }
        public void calculateSAOfBox(){
           this.b =  2 * (l*w+w*h+h*l);
        }
        public void displayDataOfBox(){
            System.out.println(b);
        }
        public void getDataForCylinder(){
            System.out.println("Enter radius and height of the cylinder");
            r = sc.nextDouble();
            h = sc.nextDouble();
        }
        public void calculateSAOfCylinder(){
            this.c = 2*Math.PI*r*(r+h);
        }
        public void displayDataOfCylinder(){
            System.out.println(c);
        }
    }
    public static double volume(double r, double h){
        return Math.PI*r*r*h;
    }
    public static double volume(double r){
        return (4.0/3.0)*Math.PI*r*r*r;
    }
    public static double volume(int s){
        return s * s * s;
    }
    public static void main(String[] args){
        SurfaceArea b1 = new SurfaceArea();
        b1.getDataForBox();
        b1.calculateSAOfBox();
        b1. displayDataOfBox();

        SurfaceArea c1 = new SurfaceArea();
        c1.getDataForCylinder();
        c1.calculateSAOfCylinder();
        c1.displayDataOfCylinder();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height for the volume of cylinder");
        double r1 = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Enter the radius for the volume of sphere");
        double r2 = sc.nextDouble();
        System.out.println("Enter the side for the volume of cube");
        int s = sc.nextInt();

        System.out.println("Volume of cylinder is "+volume(r1,h));
        System.out.println("Volume of Sphere is "+volume(r2));
        System.out.println("Volume of cube is "+volume(s));
    }
}
