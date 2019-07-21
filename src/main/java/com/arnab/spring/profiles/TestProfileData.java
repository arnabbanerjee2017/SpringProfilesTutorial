package com.arnab.spring.profiles;

public class TestProfileData implements ProfileData {

	@Override
	public String getProfileData() {
		return "Test Profile is selected.";
	}

}
