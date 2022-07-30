/**
 * Interface for DateAndTime
 *
 * @author Antonio Macabantad
 * @version my version
 */
public interface DateAndTimeInterface {
   
    //AS PER CONVENTION - constructor methods should be listed as well in comment
    //public DateAndTime();
    //public DateAndTime(int d,int m,int y,int h,int n,int s);
    public void setDateAndTime(int d, int m, int y, int h, int n, int s) throws NumberFormatException;
    public String toString();
    public void setTime(int h, int n, int s) throws NumberFormatException;
    public String timeToString();
    public String timeToMilitaryString();
    public boolean incHour();
    public boolean incMinute();
    public boolean incSecond();
    public void setDate(int d, int m, int y) throws NumberFormatException;
    public String dateToString();
    public boolean incDay();
    public boolean incMonth();
    public boolean incYear();
}
