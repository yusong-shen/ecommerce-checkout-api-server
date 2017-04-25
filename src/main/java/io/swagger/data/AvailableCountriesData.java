package io.swagger.data;

import java.util.ArrayList;
import java.util.List;

import io.swagger.model.AvailableCountries;
import io.swagger.model.Country;

public class AvailableCountriesData {

	public static AvailableCountries getData() {
		return data;
	}

	public static void setData(AvailableCountries data) {
		AvailableCountriesData.data = data;
	}

	static AvailableCountries data;
	static List<Country> shipping_countries = new ArrayList<>();
	static List<Country> billing_countries = new ArrayList<>();
	
	static {
		shipping_countries.add(CountryData.createCountry("US", "United States", "+1"));
		shipping_countries.add(CountryData.createCountry("UK", "United Kindom", "+2"));
		billing_countries.add(CountryData.createCountry("US", "United States", "+1"));
		billing_countries.add(CountryData.createCountry("UK", "United Kindom", "+2"));
		data = createAvailableCountries(shipping_countries, billing_countries);
	}
	
	public static AvailableCountries createAvailableCountries(List<Country> shipping_countries, List<Country> billing_countries) {
		AvailableCountries availableCountries = new AvailableCountries();
		availableCountries.setAvailableBillingCountries(billing_countries);
		availableCountries.setAvailableShippingCountries(shipping_countries);
		return availableCountries;
	}
	
}
