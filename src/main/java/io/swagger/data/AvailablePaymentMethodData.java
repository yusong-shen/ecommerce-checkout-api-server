package io.swagger.data;

import io.swagger.model.AvailablePaymentMethod;
import io.swagger.model.PaymentMethod;

public class AvailablePaymentMethodData {
	public static AvailablePaymentMethod createAvailablePaymentMethod(PaymentMethod paymentMethod) {
		AvailablePaymentMethod availablePaymentMethod = new AvailablePaymentMethod();
		availablePaymentMethod.setCode(paymentMethod.getCode());
		availablePaymentMethod.setName("My CreditCard");
		availablePaymentMethod.setType("CreditCard");
		
		return availablePaymentMethod;
	}
}
