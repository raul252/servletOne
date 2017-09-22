package com.testapp.main;

public class TestApp {
	Botones miboton;
	
	public static void main(String[] args) {
		if (args.length > 0 && args[0].equals("c"))
		{
		System.out.println("Bienvenidos al curso");
		}
		else
		{
			System.out.println("Bienvenidos al curso de JEE");	
		}
	}
}