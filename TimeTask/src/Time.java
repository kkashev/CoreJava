
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private int day;
    private int month;
    private int year;
    
    public Time(int hours, int minutes, int seconds, int day, int month, int year) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "" + hours + ":" + minutes + ":" + seconds + " " + day + "."
                + month + "." + year + "";
    }
    
    
    
}
