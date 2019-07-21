/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

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
