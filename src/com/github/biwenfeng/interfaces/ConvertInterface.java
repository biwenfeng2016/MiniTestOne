package com.github.biwenfeng.interfaces;

public abstract class ConvertInterface {

	public abstract String convert(Integer number);

	public void printNumber() { 
		for (int i = 1; i <= 100; i++) { 
			String result = convert(i);
			System.out.println(result);
		}
	}

}
