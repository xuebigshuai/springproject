package com.xys.service;

import org.springframework.stereotype.Component;

@Component
public class Calculator implements MatherCalculate {

	@Override
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}

	

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}



	@Override
	public double div(int a, int b) {
		return a/b;
	}

}
