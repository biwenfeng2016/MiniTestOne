package com.github.biwenfeng.service;

import com.github.biwenfeng.interfaces.ConvertInterface;

public class ConvertForDivNumber extends ConvertInterface {

	public String convert(Integer number) {

		if (checkDivBy15(number)) {
			return "BuzzFizz";
		} else if (checkDivBy3(number)) {
			return "Fizz";
		} else if (checkDivBy5(number)) {
			return "Buzz";
		}
		return number.toString();

	}

	public Boolean checkDivBy15(Integer number) {
		return number % 15 == 0;
	}

	public Boolean checkDivBy3(Integer number) {
		return number % 3 == 0;
	}

	public Boolean checkDivBy5(Integer number) {
		return number % 5 == 0;
	}

}
