import java.util.Scanner;
public class Incometax {
	
     public static void main(String[] args) {
    	 double tax=0,it;
         Scanner sc=new Scanner(System.in);
         System.out.println("Annual Income is");
         it=sc.nextDouble();
         if(it<=180000)
	         tax=0;
         else if(it<=300000)
             tax=0.1*(it-180000);
         else if(it<=5000000)
        	 tax=(0.2*(it-300000)+12000);
         else if(it<=1000000)
        	 tax=(0.3*(it-500000)+52000);
         System.out.println("Income tax amount is "+tax);


     }

}