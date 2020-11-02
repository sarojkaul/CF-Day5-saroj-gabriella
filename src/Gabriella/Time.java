package Gabriella;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "The time is:" +
                "  hours=" + this.hours +
                ", minutes=" + this.minutes +
                ", seconds=" + this.seconds;
    }

    public void printTime(){
        System.out.println(this.toString());
    }

    public void addSeconds(int s){
        this.seconds += s;
        while (this.seconds>60) {
            this.seconds -=60;
            this.minutes++;
            if (this.minutes>60) {
                addMinutes(this.minutes);
            }
        }

    }

    public void addMinutes(int m){
        this.minutes += m;
        while (this.minutes>60) {
            this.minutes -=60;
            this.hours++;
            if (this.hours>=24) {
                this.hours-=24;
            }
        }

    }

    public void addHours(int h){
        this.hours+=h;
        int i=0;
        while (this.hours>=24) {
            this.hours -=24;
            i++;
        }
        if (i>0) {
            System.out.println("Take care! You added " + i + " additional day/days!");
        }
    }

    public void addTime(int h, int m, int s){
        addSeconds(s);
        addMinutes(m);
        addHours(h);
    }
}
