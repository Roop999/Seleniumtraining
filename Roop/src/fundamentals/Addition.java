package fundamentals;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y,z = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of values for addition");
		x= s.nextInt();
		for(int p = 1; p<=x ;p++)
		{
			System.out.println("the entered value is " + p + ":");
			y = s.nextInt();
			z= z+y;
		}
		
		System.out.println("the sum of te values is " +z);
		
		s.close();
		
	}

}
