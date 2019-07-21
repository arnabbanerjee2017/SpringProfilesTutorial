/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.spring.profiles;

public class ProdProfileData implements ProfileData {

	@Override
	public String getProfileData() {
		return "Prod Profile is selected.";
	}

}
