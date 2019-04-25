package com.github.biwenfeng.service;

public class ConvertForDivAndContainNumber extends ConvertForDivNumber {

	@Override
	public String convert(Integer number) {
		if (checkDivBy15(number)
				|| (checkContain3(number) && checkContain5(number))
				|| (super.checkDivBy3(number) && checkContain5(number))
				|| (checkDivBy5(number) && checkContain3(number))) {
			return "FizzBuzz";
		} else if (checkDivBy3(number) || checkContain3(number)) {
			return "Fizz";
		} else if (checkDivBy5(number) || checkContain5(number)) {
			return "Buzz";
		} else {
			return number.toString();
		}
	}

	public Boolean checkContain3(Integer number) {

		number.toString().getBytes();

		for (char c : number.toString().toCharArray()) {
			if (c == '3') {
				return true;
			}
		}
		return false;
	}

	public boolean checkContain5(Integer number) {

		number.toString().getBytes();

		for (char c : number.toString().toCharArray()) {
			if (c == '5') {
				return true;
			}
		}
		return false;
	}

}
