package io.swagger.data;

import java.util.List;

import io.swagger.model.AvailablePaymentMethod;
import io.swagger.model.AvailablePaymentMethodList;

public class AvailablePaymentMethodListData {

	public static AvailablePaymentMethodList create(List<AvailablePaymentMethod> lst) {
		AvailablePaymentMethodList availablePaymentMethodList = new AvailablePaymentMethodList();
		availablePaymentMethodList.setAvailablePaymentMethods(lst);
		return availablePaymentMethodList;
	}

}
