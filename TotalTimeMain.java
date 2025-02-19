//Calculate the total time period by adding two periods specified in terms of hours, min and sec
import java.util.*;
public class TotalTimeMain {
   static class Time{
        private int hr;
        private int min;
        private int sec;
        Scanner sc = new Scanner (System.in);
        public void getData() {
            System.out.println("Enter time in hr:min:sec ");
            hr = sc.nextInt();
            min = sc.nextInt();
            sec = sc.nextInt();
        }
        public void putData(){
            System.out.println("hr : min : sec\n" +hr +":"+min +":"+sec);
        }
        public int convert(){
            return hr*3600 + min*60 + sec;
        }
        public void calculate(Time t1,Time t2) {
          hr = Math.abs(t1.hr + t2.hr);
          min = Math.abs(t1.min + t2.min);
          sec = Math.abs(t1.sec + t2.sec);
        }
        public static void convertFromSec(int a) {
            int hr = a / 3600;
            int b = a % 3600;
            int min = b / 60;
            int sec = b % 60;
            System.out.println("hr : min : sec\n" +hr +":"+min +":"+sec);
        }

    }
    public static void main (String[] args){
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.getData();
        t2.getData();

        t3.calculate(t1,t2);

        int n = t3.convert();
        t3.convertFromSec(n);

    }
}
