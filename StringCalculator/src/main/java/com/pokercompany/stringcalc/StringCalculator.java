/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokercompany.stringcalc;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Horváth Dániel
 */
public class StringCalculator {

	private char separator = ',';

	public StringCalculator() {

	}

	public StringCalculator(char separator) {
		this.separator = separator;
	}

	public int add(String numbers) throws Exception {
		if (numbers == null) {
			throw new NullPointerException();
		}

		if (numbers.equals("")) {
			return 0;
		}

		if (!numbers.matches("-?[0-9]+([" + separator + "]-?[0-9]+)*[" + separator + "]?")) {
			throw new NumberFormatException("Bad character(s) in input string: " + numbers);
		}

		List<String> numbersList = Arrays.asList(numbers.split("(?<!\\" + separator + ")[" + separator + "]"));
		List<String> negativeNumbers = StringCalcUtil.getListWherePatternMatches(numbersList, "[-][0-9]+");

		if (negativeNumbers.size() > 0) {
			throw new Exception("Negative not allowed: " + StringUtils.join(negativeNumbers.iterator(), ","));
		}

		int sum = 0;
		for (String stringNumber : numbersList) {
			sum += Integer.valueOf(stringNumber);
		}

		return sum;
	}

	public char getSeparator() {
		return separator;
	}

	public void setSeparator(char separator) {
		this.separator = separator;
	}

}
