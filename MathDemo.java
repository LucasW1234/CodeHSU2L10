import static java.lang.Math.*;

public class MathDemo{
    public static void main(String[] args){
        
        //absolute value
        double x = 34.3;
        double y = -12.2;
        double x2 = 15.4;
        double y2 = 11;
        double angle = 2.3;//radians
        double angle2 = 60;//degrees
        System.out.println (Math.abs(y));
        System.out.println (abs(y2));//also works if you import java.lang.Math.*;
        //square root something
        double sqrtx = Math.sqrt(x);
        System.out.println (sqrtx);
        
        //use exponents
        double powerExample = Math.pow(x,y2);
        System.out.println (powerExample);
        
        //find the sin, cos, and tan of an angle
        double cosAngle = Math.cos(angle);
        double sinAngle = Math.sin(angle);
        double tanAngle = Math.tan(angle);
        System.out.println("the sin of "+(Math.toDegrees(angle))+"is "+sinAngle);
        System.out.println("the cos of "+(Math.toDegrees(angle))+"is "+cosAngle);
        System.out.println("the tan of "+(Math.toDegrees(angle))+"is "+tanAngle);
        
        //convert to radians by multiplying by pi/180
        final double PI = Math.PI;
        System.out.println ("PI is: "+PI);
        double angle2Rad = angle2*(PI/180);
        System.out.println (angle2+" in radians is: "+angle2Rad);
        
        
        //area of a circle
        double radius = 4;
        double area = PI*(Math.pow(radius,2));
        System.out.println ("A circle with a radius of "+radius+" has an area of "+area);
    }
}