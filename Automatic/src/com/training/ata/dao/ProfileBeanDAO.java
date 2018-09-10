package com.training.ata.dao;

import java.util.ArrayList;

import com.training.ata.bean.ProfileBean;



public interface ProfileBeanDAO {
	
	default ProfileBean findByID(ProfileBean pb)
		{
			return pb;
			
		}
		
		default String createVehicle(ProfileBean db) {
			return null;
		}

		default int deleteVehicle(ArrayList<ProfileBean> db )
		{
			return 0;
		}
		default boolean updateVehicle(ProfileBean vb)
		{
			return false;
		}
		default ArrayList<ProfileBean> findAll()
		{
			return null;
			
		}

		

}
