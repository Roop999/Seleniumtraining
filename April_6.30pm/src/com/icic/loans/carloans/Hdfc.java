package com.icic.loans.carloans;

public class Hdfc implements Rbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hdfc  h = new Hdfc();
h.deosite();
h.withdraw();
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("hey");
	}

	@Override
	public void deosite() {
		// TODO Auto-generated method stub
		System.out.println("bro");
	}

}
