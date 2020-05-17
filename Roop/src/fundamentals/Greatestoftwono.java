package fundamentals;

import java.util.Scanner;

public class Greatestoftwono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     int x, y,z;
     System.out.println("enter x value");
     x= s.nextInt();
     System.out.println("enter y value");
     y = s.nextInt();
     System.out.println("enter z value");
     z=s.nextInt();
     
    
     if(x>=y && x>=z)
     {
    System.out.println( "X is greter " );	 
    
     }
     else if(y>=x && y>=z)
     {
    	 System.out.println("Y is greter " );
     }
     else
    	 System.out.println("z is greter" );
     s.close();
	}
	
}
