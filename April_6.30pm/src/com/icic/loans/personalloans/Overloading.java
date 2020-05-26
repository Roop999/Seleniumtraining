package com.icic.loans.personalloans;

public class Overloading {
    
	
	public void m1(int a)
	{
		System.out.println(a);
	}
	
	public void m1(String d)
	{
		System.out.println(d);
	}
	
	public void m1(float f)
	{
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Overloading O = new Overloading();
    
    O.m1(542566);
    O.m1(366131);
	}

}
