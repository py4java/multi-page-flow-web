package com.mpf.form;

public class AddressInfo {

	protected String street;
	protected String city;
	protected String zip;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "AddressInfo [street=" + street + ", city=" + city + ", zip=" + zip + "]";
	}

}
