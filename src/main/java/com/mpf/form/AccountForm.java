package com.mpf.form;

public class AccountForm {

	protected PersonalInfo personalInfo;
	protected AddressInfo addressInfo;
	protected String accountType;

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public AddressInfo getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "AccountForm [personalInfo=" + personalInfo + ", addressInfo=" + addressInfo + ", accountType="
				+ accountType + "]";
	}

}
