/**
 * Assignment 1
 * @author <<YOUR NAMES AND STUDENT IDs HERE>>
 * @version <<DATE>>
 * 
 * Split <<50:50 or change!>>
 */
import javax.swing.Timer;

public class AssigOne222
{
    public static int setMissileAngle(int currentAngle){
        return (currentAngle+1);
    }

    public static void main(String []args)
    {
        final int DISTANCE = 8000;//distance(km) between Launchtown and Doomsville
        final int HEIGHT = 20;//height(km) of the missisles trajectory//minor radius
        final int LOCATION = 4000;//lasers distance(km) relative to launchtown//major radius
        final int HOUR = 12;//hour missile is fired
        final int MINUTE = 30;//minute missile is fired
        final double MISSILEMOVETIME = 7.405;//time for missile to move 1 degree on trajectory

        final double LASERCHARGETIME = 15.737;//time in seconds laser needs to charge
        final double LASERMOVETIME = 3.61;//time for laser to move 1 degree

       
        Time t = new Time(HOUR,MINUTE);
        boolean enroute = true;
        while(enroute){

        }
    }
}