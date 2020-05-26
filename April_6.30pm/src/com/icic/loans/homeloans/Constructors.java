package com.icic.loans.homeloans;

public class Constructors {

	int a;
	String b;
	//private char[] z;
	int d;
	
	
	public Constructors() {
		// TODO Auto-generated constructor stub
		System.out.println("default");
	}
	
	
	public Constructors(int i) {
		// TODO Auto-generated constructor stub
			this();
			a=i;
			System.out.println(this.a);
			
	}
	
	public Constructors(int i, String s) 
	
	{
		this(888);
		this.a=i;
		this.b=s;
		
		System.out.println(this.a);
		System.out.println(this.b);
		
	}
  


     
	
	public Constructors(int i, String string2, int string) {
		// TODO Auto-generated constructor stub
		this(555,"lkh");
		a=i;
		b=string2;
		d=string;
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.d);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Constructors c3= new Constructors(5000,"kumar",999);
		
		
		
	}

	
	
}
