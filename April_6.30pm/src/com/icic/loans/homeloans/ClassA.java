package com.icic.loans.homeloans;

import java.util.Date;

public class ClassA {

	
	public void m1()
	{
		System.out.println("hello");
	}
	
	static 
	{
		Date d = new Date();
	    System.out.println(d);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ClassA a = new ClassA();
      // a.m2();//is a relation
       a.m1();
	}

}
