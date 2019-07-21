package com.arnab.spring.profiles;

public class ProdProfileData implements ProfileData {

	@Override
	public String getProfileData() {
		return "Prod Profile is selected.";
	}

}
