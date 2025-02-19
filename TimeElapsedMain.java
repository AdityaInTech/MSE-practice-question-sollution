// calculate time elapsed between two time instances t1(hr,min,sec) and t2(hr,min,sec)
import java.util.*;
public class TimeElapsedMain {
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
    }
    public static int convert(int hr, int min, int sec){
        return hr *3600 + min *60 + sec ;
    }
    public static int elapsed(int p, int q){
       return Math.abs(p - q);
    }

    public static void convertInHrMinSec(int a){
        int hr = a/3600;
        int b = a%3600;
        int min = b/60;
        int sec = b%60;

        System.out.println("The time elapsed is \n hr : min : sec\n"+hr+" : "+min+" : "+sec);
    }
    public static void main(String[] args){
        Time t1 = new Time();
        Time t2 = new Time();
        t1.getData();
        t2.getData();

        int time1 = convert(t1.hr,t1.min,t1.sec);
        int time2 = convert(t2.hr,t2.min,t2.sec);

        int diff = elapsed(time1, time2);
        convertInHrMinSec(diff);
    }
}
