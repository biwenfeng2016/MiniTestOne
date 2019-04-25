package com.github.biwenfeng.minitest;

import org.junit.Test;
import com.github.biwenfeng.interfaces.ConvertInterface;
import com.github.biwenfeng.service.ConvertForDivAndContainNumber;
import com.github.biwenfeng.service.ConvertForDivNumber;

public class MiniTest {

	private ConvertInterface convertInterface;

	@Test
	public void testConvertDivNumber() {
		setConvertInterface(new ConvertForDivNumber());
		convertInterface.printNumber();
	}

	@Test
	public void testConvertForDivAndContainNumber() {
		setConvertInterface(new ConvertForDivAndContainNumber());
		convertInterface.printNumber();
	}

	public ConvertInterface getConvertInterface() {
		return convertInterface;
	}

	public void setConvertInterface(ConvertInterface convertInterface) {
		this.convertInterface = convertInterface;
	}
}
