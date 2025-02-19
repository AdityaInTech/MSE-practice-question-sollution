import java.util.Scanner;

public class TotalYearMonthDays {
    static class Period{
    private int year;
    private int month;
    private int days;
    Scanner sc = new Scanner (System.in);
    public void getData() {
        System.out.println("Enter period in hr:min:sec ");
        year = sc.nextInt();
        month = sc.nextInt();
        days = sc.nextInt();
    }
    public int convert(){
        return year*365 + month*30 + days;
    }
    public void calculate(Period t1, Period t2) {
        year = Math.abs(t1.year + t2.year);
        month = Math.abs(t1.month + t2.month);
        days = Math.abs(t1.days + t2.days);
    }
    public static void convertFromSec(int a) {
        int hr = a / 365;
        int b = a % 365;
        int min = b / 30;
        int sec = b % 30;
        System.out.println("hr : min : sec\n" +hr +":"+min +":"+sec);
    }

}
    public static void main (String[] args){
        Period t1 = new Period ();
        Period t2 = new Period ();
        Period t3 = new Period ();
        t1.getData();
        t2.getData();

        t3.calculate(t1,t2);

        int n = t3.convert();
        t3.convertFromSec(n);




    }

}
