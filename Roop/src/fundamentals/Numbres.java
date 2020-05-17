package fundamentals;

import java.util.Scanner;

public class Numbres {

	public static void main(String[] args) {
		int x, y,z;
		Scanner s = new Scanner(System.in);
		System.out.println("enter two any two values");
		
		 x = s.nextInt();
		System.out.println("entered x value is  " +x );
		 y = s.nextInt();
		System.out.println("entered y value is " +y);
		 z= x+y;
		System.out.println("sum of x "+ x + "sum of y" + y + "is " +z);
		s.close();
	}
	
}
