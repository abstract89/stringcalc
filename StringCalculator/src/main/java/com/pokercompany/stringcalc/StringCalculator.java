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

	public int add(String numbers) throws NumberFormatException {
		if (numbers == null) {
			throw new NullPointerException();
		} else if (numbers.equals("")) {
			return 0;
		}

		String[] numbersArray = numbers.split(",");

		int sum = 0;
		for (String stringNumber : numbersArray) {
			sum += Integer.valueOf(stringNumber);
		}

		return sum;
	}
}
