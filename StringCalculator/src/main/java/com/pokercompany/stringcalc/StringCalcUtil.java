/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokercompany.stringcalc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author Horváth Dániel
 */
public class StringCalcUtil {

	public static List<String> getListWherePatternMatches(List<String> numbers, String pattern) {
		List<String> negativeNum = new ArrayList<>();
		Pattern p = Pattern.compile(pattern);
		for (String num : numbers) {
			if (p.matcher(num).matches()) {
				negativeNum.add(num);
			}
		}
		return negativeNum;
	}

}
