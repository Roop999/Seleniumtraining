package com.icic.loans.homeloans;

public class ClassB extends ClassA {

	public void m1()
	{
		System.out.println("new hello");
	}
	
	public void m2()
	{
		System.out.println("hai");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassB b = new ClassB();
    b.m2();
    
    ClassA a = new ClassA();//has a relation
    a.m1();
    
    ClassA z = new ClassB();
    z.m1();
	}
}
