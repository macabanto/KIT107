/**
 * Implementation of AdjustableTime
 *
 * @author Antonio Macabantad
 * @version my version
 */


public class AdjustableTime extends Time implements AdjustableTimeInterface{

    protected final int MIN_HOUR = 0;
    protected final int MAX_HOUR = 23;
    protected final int MIN_MIN = 0;
    protected final int MAX_MIN = 59;
    protected final int MIN_SEC = 0;
    protected final int MAX_SEC = 59;
    
    protected int hour,minute,second;
    protected Time time;
    /*
     * d - day
     * m - month
     * y -  year
     * h - hour
     * m - minute
     * s - second
     */
    /*
     * AdjustableTime is a narrower class of type Time that will allow time to change
     * There are 2 constructors: first only creates new object at 0 time, second creates and initializes object at specified time
     */
    public AdjustableTime(){
        time = new Time();
        this.setTime(MIN_HOUR, MIN_MIN, MIN_SEC);
    }

    public AdjustableTime(int h, int n, int s){
        time = new Time();
        this.setTime(h, n, s);
    }

    public void setTime(int h, int n, int s) throws NumberFormatException{
        this.hour=h;
        this.minute=n;
        this.second=s;
    }
    /*
     * this method will 
     */
    public String toString(){
        String hr = "";
        int maxHour = 12;
        String min = "";
        String sec = "";
        if(this.hour < 10){
            hr = "0";
        }
        if(this.minute < 10){
            min = "0";
        }
        if(this.second < 10){
            sec = "0";
        }
        if(this.hour > maxHour){
            if((this.hour-12) < 10){
                hr = "0";
            }
            return hr+(this.hour-12)+":"+min+this.minute+":"+sec+this.second+" PM";
        }
        return hr+this.hour+":"+min+this.minute+":"+sec+this.second+" AM";
    }
    public String toMilitaryString(){
        String hr = "";
        String min = "";
        String sec = "";
        if(this.hour < 10){
            hr = "0";
        }
        if(this.minute < 10){
            min = "0";
        }
        if(this.second < 10){
            sec = "0";
        }
        return hr+this.hour+":"+min+this.minute+":"+sec+this.second;
    }
    public boolean equals(Time t){
        return true;//TODO
    }
    public boolean incHour(){
        boolean overflow = false;
        if(this.hour > MAX_HOUR){
            this.hour = MIN_HOUR;
            overflow = true;
        }
        return overflow;
    }
    public boolean incMinute(){
        boolean overflow = false;
        this.minute++;
        if(this.minute > MAX_MIN){
            this.minute = MIN_MIN;
            overflow = true;
        }
        if(overflow){
            return incHour();
        }
        return overflow;
    }
    public boolean incSecond(){
        boolean overflow = false;
        this.second++;
        if(this.second > MAX_SEC){
            this.second = MIN_SEC;
            overflow = true;
        }
        if(overflow){
            return incMinute();
        }
        return overflow;
    }
}
