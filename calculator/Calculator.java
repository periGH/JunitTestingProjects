package com.platform.project.application;

import org.junit.Test;

public class Calculator {

	private double add(double num1, double num2) {
		
		double max = Double.MAX_VALUE; 
		double min = Double.MIN_VALUE; 

		if((num1>0 && num2>0) || (num1<0 && num2<0)) {
			if(max-Math.abs(num2) < Math.abs(num1)) { 
				System.out.println("num1+num2 out of bounds");
				throw new ArithmeticException("num1+num2 out of bounds"); 
			}
		}
		return num1 + num2; 
	} 
	
	private double subtract(double num1, double num2) {
		
		double max = Double.MAX_VALUE; 
		double min = Double.MIN_VALUE; 
		if((num1<0 && num2>0) || (num1>0 && num2<0)) {
			if(max + Math.abs(num2) < Math.abs(num1)) {
				System.out.println("num1-num2 out of bounds");
				throw new ArithmeticException("num1-num2 out of bounds"); 
			}
		} return num1-num2; 
	}
	
	private double divide(double num1, double num2) {
		if(num2==0) {
			System.out.println("Division by 0 is not allowed");
			throw new IllegalArgumentException("Division by 0 is not allowed."); 
		}
		return num1/num2; 
	}
	private double multiply(double num1, double num2) {
		if((num1 == 0) || (num2 == 0)) {
			System.out.println("Multiplying by 0(zero) is not allowed.");
			throw new ArithmeticException("Multiplying by 0 is not allowed."); 
		}
		return num1*num2; 
	}

	public double calculate(double num1, double num2, char operationSign) {  		
		switch(operationSign) {
		case '+':
			return add(num1, num2); 
		case '-':
			return subtract(num1, num2); 
		case '*':
			return multiply(num1, num2); 
		case '/': 
			return divide(num1,num2); 
			
			default:
				System.out.println("Operation sign can only be + - * /");
				throw new IllegalArgumentException("Operation sign can only be +-*/"); 
		}
	}
	
}
