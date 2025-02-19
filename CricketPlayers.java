// Store and display n no. of cricket players his name country no.of matches and batting average

import java.util.*;
public class CricketPlayers {
    static class Cricket{
        private String name;
        private String country;
        private int no;
        private double battingAverage;
        Scanner sc = new Scanner(System.in);
        public void getData(){
            name = sc.nextLine();
            country = sc.nextLine();
            no=sc.nextInt();
            battingAverage = sc.nextDouble();
        }
        public void display(){
            System.out.println("Name : " +name);
            System.out.println("Country name : "+country);
            System.out.println("No. of Matches he played : "+no);
            System.out.println("Batting Average : "+battingAverage);
        }
    }
    public static void main (String[] args){
        System.out.println("Enter the no of Players info you want to enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        Cricket c[] = new Cricket[n];
        for (i=0;i<n;i++){
            c[i] = new Cricket();
            System.out.println("Enter the name, country from which he belong, no. of Matches he played, his average of cricketer "+ (i+1));
            c[i].getData();
        }
        for(i=0;i<n;i++){
            System.out.println("The info. of cricketer "+(i+1)+" is ");
            c[i].display();
        }
    }
}
