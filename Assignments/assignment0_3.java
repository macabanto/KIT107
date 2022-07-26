/**
 * assignment0_3.java
 * @author Antonio Macabantad
 * 590390
 * this is a formative program with the purpose of determining my strengths and weaknesses
 * 24 July 2022
 **/
import java.util.Scanner;
public class assignment0_3 
{
    public static void main(String args[])
    {
        final int SIZE = 10;//size is final as it doesnt change; determines size of double[]
        double[]dArray = new double[SIZE];//double array stores input doubles
        Scanner in = new Scanner(System.in);
        double sum=0;//sum of all the doubles
        double dIn;//double the user inputs
        System.out.println("Please enter a up to 10 non-negative double values");
        for(int i = 0; i < SIZE; i++){
            dIn=in.nextDouble();
            if(dIn == -1.0)
            {
                i=SIZE;
            }
            else if(dIn<0)
            {
                System.out.println("Must be non-negative");
                i--;
            }
            else
            {
                dArray[i] = dIn;
                sum=sum+dIn;
            }
        }
        System.out.println(sum);
    }
}
