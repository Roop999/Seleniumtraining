package fundamentals;

import java.util.Scanner;

public class Basicb_pb extends salary{

	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter values between 1 to 5");
		int x = s.nextInt();
		
		
		
		
		switch(x)
		{
		case 1 :
			System.out.println("entered value is 1");
			break;
		case 2 :
			System.out.println("entered value is 2");
			break;
		case 3:
			System.out.println("entered value is 3");
			break;
		case 4 :
			System.out.println("entered value is 4");
			break;
		case 5 :
			System.out.println("entered value is 5");
			default :
				System.out.println("invalid no.");
			
			
			
		
		}
		s.close();
	}
	

}
