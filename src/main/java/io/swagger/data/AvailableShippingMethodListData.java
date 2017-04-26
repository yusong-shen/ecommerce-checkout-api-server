package io.swagger.data;

import java.util.List;

import io.swagger.model.AvailableShippingMethod;
import io.swagger.model.AvailableShippingMethodList;

public class AvailableShippingMethodListData {

	public static AvailableShippingMethodList create(List<AvailableShippingMethod> lst) {
		AvailableShippingMethodList res = new AvailableShippingMethodList();
		res.setAvailableShippingMethods(lst);
		return res;
	}

}
