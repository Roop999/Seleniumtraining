package com.icic.loans.personalloans;

import com.icic.loans.homeloans.ClassA;

public class ClassC extends ClassA {

	
	public void m3() {
		System.out.println("nameste");
	}
	public static void main(String[] args) {
		
  ClassC c = new ClassC();
  c.m3();
  c.m1();
 // c.m2();
  
  
 // ClassB b =  new ClassB();
 // b.m2();
	}

}
