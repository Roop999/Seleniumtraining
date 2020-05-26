package com.icic.loans.personalloans;

public class ArrayDemo {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]  = {10,20,30,40};
		
		/*
		 * for(int i = 0; i<=a.length;i++) { System.out.println("a [" + i + "] a  "
		 * +a[i]);
		 * 
		 * }
		 */
				
		int a[] = new int[8];//another way of declaration 
		
		a[0]= 1;
		a[1]= 10;
		a[2]= 100;
		a[3]= 1000;
		for(int i = 0; i<a.length;i++)
		{ System.out.println("a [" + i + "] a  "
				  +a[i]);
		
		}
	}

}
