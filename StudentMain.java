// class student take input of 10 student of their name, roll no., marks .And find the total of each student marksDisplai records
import java.util.*;
public class StudentMain {
    static class Student{
        private String name;
        private String roll;
        private double markP;
        private double markC;
        private double markM;
        Scanner sc = new Scanner(System.in);
        public void getData(){
            name = sc.nextLine();
            roll = sc.nextLine();
            markP = sc.nextDouble();
            markC = sc.nextDouble();
            markM = sc.nextDouble();
        }
        public double calculateTotal(){
            return markP + markC + markM;
        }
        public void display(){
            System.out.println(name);
            System.out.println(roll);
            System.out.println("Marks of P is "+markP+"c is "+markC+"m is "+markM);
            System.out.println(calculateTotal());
        }
    }
    public static void main(String [] args){
        System.out.println("Enter no of Student");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        Student s[]  = new Student[n];

        for (i = 0; i<n;i++){
            s[i]  = new Student();
            System.out.println("Enter the name, roll no., marks in P,C,M of student "+ (i+1));
            s[i].getData();
        }
        for (i = 0; i<n;i++){
            s[i].calculateTotal();
        }

        for(i=0;i<n;i++){
            System.out.println("The info of the student "+(i+1)+" is ");
            s[i].display();
        }


    }
}
