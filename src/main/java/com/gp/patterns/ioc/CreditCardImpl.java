package com.gp.patterns.ioc;

import org.springframework.stereotype.Component;

@Component
public class CreditCardImpl implements CreditCard{

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("pmt made");
		System.out.println("test 04192020 1055pm");
		
	}

}
