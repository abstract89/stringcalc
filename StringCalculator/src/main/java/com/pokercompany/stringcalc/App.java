/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokercompany.stringcalc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Horváth Dániel
 */
public class App {

	public void start() {
		stringCalcUse();
	}

	private void stringCalcUse() {
		StringCalculator stringCalculator = new StringCalculator('|');
		String numbers = "2|34|5|3", numbers2 = "2--4-5-3";

		try {

			int sum = stringCalculator.add(numbers);
			System.out.printf("A (%s) számok összege: %d\n", numbers, sum);

			stringCalculator.setSeparator('-');
			System.out.printf("A (%s) számok összege: \n", numbers2);
			sum = stringCalculator.add(numbers2);
		} catch (NullPointerException ex) {
			Logger.getLogger(App.class.getName()).log(Level.SEVERE, ex.getMessage());
		} catch (NumberFormatException ex) {
			Logger.getLogger(App.class.getName()).log(Level.SEVERE, ex.getMessage());
		} catch (Exception ex) {
			Logger.getLogger(App.class.getName()).log(Level.SEVERE, ex.getMessage());
		}
	}
}
