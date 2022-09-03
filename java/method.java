package com.ust;

public class method {
	static int x=1;
	private int y=3;
	public void method1(int x)
	{
		method t=new method();
		this.x=2;
		y=4;
		System.out.println("Test1.x:"+method.x);
		System.out.println("t.x:"+t.x);
		System.out.println("y:"+y);
	}
	public static void main(String args[])
	{
		method t=new method();
	    t.method1(5);
	}
		
	}


