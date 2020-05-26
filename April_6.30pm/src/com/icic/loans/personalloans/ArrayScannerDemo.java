package com.icic.loans.personalloans;

import java.util.Scanner;

public class ArrayScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("enter aray size");
			int Size = s.nextInt();
			int sum = 0;
		int a[]= new int[ Size];
			
			for(int i = 0; i< s.nextInt();i++)
			{ 
				
				a[i]= s.nextInt();
				
				 sum = sum+a[i];
				System.out.println("a [" + i + "] a  " +a[i]);
			}
				System.out.println(sum);
				s.close();
	}

}
