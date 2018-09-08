package com.training.ata.util;

import com.training.ata.bean.CredentialsBean;
import com.training.ata.bean.ProfileBean;

public interface User {
	
	default String login(CredentialsBean credentialsBean) {
		return null;
		
	}
	
	default boolean logout(String userId) {
		return false;
		
	}
	
	
	default String changePassword(CredentialsBean credentialsBean, String newPassword) {
		return newPassword;
		
	}
	
	default String register(ProfileBean profileBean) {
		return null;
		
	}


}
