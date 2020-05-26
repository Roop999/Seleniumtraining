package com.icic.loans.carloans;

public abstract class FirstAbstract {

	int x= 10;
	public void M1() {
		System.out.println("bole bole");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) {
		FirstAbstract F = new FirstCild();
		F.M1();
		F.m2();
		
	}
}

