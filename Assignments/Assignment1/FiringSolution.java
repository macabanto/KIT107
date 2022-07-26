/**
 * Class for Firing Solution
 * ADT Implmentation for KIT107 Assignment 1
 * @author Julian Dermoudy and <<YOUR NAMES AND STUDENT IDs HERE>>
 * @version <<DATE>>
 */

import java.text.DecimalFormat;

public class FiringSolution implements FiringSolutionInterface
{
    private static final DecimalFormat FMT=new DecimalFormat("###0.000");
    
    private Time time;
    private int degree;
    private double x;
    private double y;
    
    public void setTime(Time t){

    }
    public Time getTime(){
        return this.time;
    }
    public void setDegree(int d){

    }
    public int getDegree(){
        return 1;
    }
    public void setX(double x){

    }
    public double getX(){
        return 0;
    }
    public void setY(double y){

    }
    public double getY(){
        return 0;
    }
    public String toString(){
        return "";
    }
 }