//mathmetical_formula by taking user input
import java.util.*;
public class ps2_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of V:");
        double v=sc.nextDouble();
         System.out.print("Enter the value of U:");
        double u=sc.nextDouble();
         System.out.print("Enter the value of A:");
        double a=sc.nextDouble();
         System.out.print("Enter the value of S:");
        double s=sc.nextDouble();
        double k=(((v*v)-(u*u))/(2*a*s));
        System.out.println(k);
    }
    
}
