package com.inheritance;

public class A {
	int i=10;
	static int x=20;
	
	public void m1()
	{
		System.out.println("I am m1 of A");
	}
	
	public static void m2()
	{
		System.out.println("I am m2 of A");
	}
	
	{
		System.out.println("I am instance block of A");
	}
	
	static {
		System.out.println("I am static block of A");
	}
}
