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
