package com.arnab.spring.profiles.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.arnab.spring.profiles.ProfileData;
import com.arnab.spring.profiles.TestProfileData;

@Configuration
@Profile("test")
public class TestProfileConfig {

	@Bean
	public ProfileData getMyProfile() {
		return new TestProfileData();
	}
	
}
