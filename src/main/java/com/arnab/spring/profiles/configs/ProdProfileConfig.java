/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.spring.profiles.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.arnab.spring.profiles.ProdProfileData;
import com.arnab.spring.profiles.ProfileData;

@Configuration
@Profile("prod")
public class ProdProfileConfig {

	@Bean
	public ProfileData getMyProfile() {
		return new ProdProfileData();
	}
	
}
