package com.arnab.spring.profiles;

public class DevProfileData implements ProfileData {

	@Override
	public String getProfileData() {
		return "Dev Profile is selected.";
	}

}
