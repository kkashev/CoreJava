

public class Main {

    public static void main(String[] args) {
       /*Time time = new Time(17, 59, 23, 28, 3, 2015);

       System.out.println(time);
       */
        Time time = new PuttingTime().hours(18).minutes(22).seconds(30).day(24).month(3).year(2013).putTime();
        Time time1 = new PuttingTime().hours(18).minutes(22).seconds(30).day(24).month(3).year(2013).putTime();
        Pair pair = new Pair(time, time1);
        System.out.println(pair);
    }
}
