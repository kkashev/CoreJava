
public class PuttingTime {
        private int hours;
        private int minutes;
        private int seconds;
        private int day;
        private int month;
        private int year;
        
        public PuttingTime(){}
        
        public Time putTime(){
            return new Time(hours, minutes, seconds, day, month, year);
        }
        

        public PuttingTime hours(int hours) {
            this.hours = hours;
            return this;
        }



        public PuttingTime minutes(int minutes) {
            this.minutes = minutes;
            return this;
        }



        public PuttingTime seconds(int seconds) {
            this.seconds = seconds;
            return this;
        }



        public PuttingTime month(int month) {
            this.month = month;
            return this;
        }



        public PuttingTime year(int year) {
            this.year = year;
            return this;
        }



        public PuttingTime day(int day) {
            this.day = day;
            return this;
        }
        
        
    
    
}
