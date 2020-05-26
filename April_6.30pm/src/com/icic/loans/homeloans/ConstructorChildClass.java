package com.icic.loans.homeloans;

public class ConstructorChildClass extends Constructors{

	String s;
	
	
	public ConstructorChildClass(String string) {
		// TODO Auto-generated constructor stub
		super(5000,"kumar",999);
		s= string;
		
		System.out.println(s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorChildClass cs = new ConstructorChildClass("sarika");
		
		
	}

}
