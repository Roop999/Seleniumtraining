package com.icic.loans.carloans;

public interface Rbi {

	
	public void withdraw();
	public void deosite();
	
	public static void main(String[] args) {
		
		Rbi i = new icic();
		i.deosite();
		i.withdraw();
		
		Rbi i1= new Hdfc();
		i1.deosite();
		i1.withdraw();
		
		
	}
}
