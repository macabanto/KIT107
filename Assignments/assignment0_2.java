
/**
 * assignment0_2.java
 * @author Antonio Macabantad
 * 590390
 * display integers determined from user inputs
 * 24 July 2022
 **/
import java.util.Scanner;
public class assignment0_2 
{
    public static void main(String args[]) 
    {
        int start;//stores user input for starting int
        int end;//stores user input for last int
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the starting point: ");
        start = in.nextInt();
        System.out.println("Please input the end point: ");
        end = in.nextInt();
        for (int i = start; i <= end; i++) 
        {
            System.out.println(i);
        }
    }
}
