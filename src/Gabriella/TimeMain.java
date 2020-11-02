package Gabriella;

public class TimeMain {

    public static void main(String[] args) {

        Time t1= new Time(12,35,55);
        Time t2= new Time(11,15,45);
        Time t3= new Time(15,45,25);
        Time t4= new Time(9,0,10);
        Time t5= new Time(22,25,15);

        Time timeArr[] = {t1,t2,t3,t4,t5};
        t1.printTime();

        for (Time xTemp: timeArr) {
            xTemp.printTime();
        }


        System.out.println("-----------------adding 100 Minutes---------");
        t1.printTime();
        t1.addMinutes(100);
        t1.printTime();

        System.out.println("-----------------adding 60 hours, 70 minutes and 80 seconds -------------");
        t1.printTime();
        t1.addTime(60,70,80);
        t1.printTime();

    }
}
