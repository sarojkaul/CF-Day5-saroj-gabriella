package saroj;

public class Time {


    public Time(int hour, int minutes, int seconds) {
    this.hour = hour;
    this.minutes = minutes;
    this.seconds = seconds;
    }
    public void displayTime(){
        System.out.println("Time is" +hour +"hours," +minutes +"minutes" +seconds +"seconds." );
    }
}
