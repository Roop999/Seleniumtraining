package com.icic.loans.carloans;

public class Secondclass {
    
	int a=10, b= 20, c;//properties
	public void Add()//Behavior
	{
		c= a+b;
		System.out.println("addtion of two values" +c);
	}
	
	public void sub()
	{
		c= a-b;
		System.out.println("sub of two values" +c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hi");
		Secondclass s= new Secondclass();
		s.Add();
		s.sub();
	}

}
