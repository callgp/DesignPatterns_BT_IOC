package com.gp.patterns.ioc;

import org.springframework.stereotype.Component;

@Component
public class CreditCardImpl implements CreditCard{

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("pmt made");
		
	}

}
