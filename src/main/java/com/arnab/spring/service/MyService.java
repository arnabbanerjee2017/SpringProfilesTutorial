package com.arnab.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnab.spring.profiles.ProfileData;

@Service
public class MyService {

	@Autowired
	private ProfileData profileData;
	
	public String getProfileData() {
		return profileData.getProfileData();
	}
	
}
