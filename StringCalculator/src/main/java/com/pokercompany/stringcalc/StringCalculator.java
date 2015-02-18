/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokercompany.stringcalc;

/**
 *
 * @author Horváth Dániel
 */
public class StringCalculator {

	private String separator = ",";

	public StringCalculator() {

	}

	public StringCalculator(String separator) {
		this.separator = separator;
	}

	public int add(String numbers) {
		if (numbers == null) {
			throw new NullPointerException();
		}

		if (numbers.equals("")) {
			return 0;
		}

		if (!numbers.matches("[0-9]+([" + separator + "][0-9]+)*[" + separator + "]?")) {
			throw new NumberFormatException(numbers);
		}

		String[] numbersArray = numbers.split("[" + separator + "]");

		int sum = 0;
		for (String stringNumber : numbersArray) {
			sum += Integer.valueOf(stringNumber);
		}

		return sum;
	}

	public String getSeparator() {
		return separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

}
