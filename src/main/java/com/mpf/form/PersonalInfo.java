package com.mpf.form;

public class PersonalInfo {

	protected String mobileNo;
	protected String emailAddress;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "PersonalInfo [mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + "]";
	}

}
