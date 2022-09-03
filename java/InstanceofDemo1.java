package com.ust;
class Fruit{}
class Vehicle{}
public class InstanceofDemo1 
	{
		public static void main(String[]args)
		{
			Fruit apple=new Fruit();
			Vehicle car=new Vehicle();
			
			System.out.println("car IS A Fruit:"+(car instanceof Fruit));
			
		}
	}


