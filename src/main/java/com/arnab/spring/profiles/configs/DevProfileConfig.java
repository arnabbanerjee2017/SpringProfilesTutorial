package com.arnab.spring.profiles.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.arnab.spring.profiles.DevProfileData;
import com.arnab.spring.profiles.ProfileData;

@Configuration
@Profile("dev")
public class DevProfileConfig {

	@Bean
	public ProfileData getMyProfile() {
		return new DevProfileData();
	}
	
}
