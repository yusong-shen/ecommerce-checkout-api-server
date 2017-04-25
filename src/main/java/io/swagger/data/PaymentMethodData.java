package io.swagger.data;

import io.swagger.model.PaymentMethod;

public class PaymentMethodData {

	public static PaymentMethod createPaymentMethod(String cardCcv, String cardExpMonth, String cardExpYear, 
			String cardNumber, String code) {
		PaymentMethod paymentMethod = new PaymentMethod();
		paymentMethod.setCardCcv(cardCcv);
		paymentMethod.setCardExpMonth(cardExpMonth);
		paymentMethod.setCardExpYear(cardExpYear);
		paymentMethod.setCardNumber(cardNumber);
		paymentMethod.setCode(code);
		
		return paymentMethod;
	}
}
