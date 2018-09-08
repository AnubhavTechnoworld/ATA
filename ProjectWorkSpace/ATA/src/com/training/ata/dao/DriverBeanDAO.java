package com.training.ata.dao;

import java.util.ArrayList;

import com.training.ata.bean.DriverBean;


public interface DriverBeanDAO {
	
	default DriverBean findByID(DriverBean db)
		{
			return db;
			
		}
		
		default String createVehicle(DriverBean db) {
			return null;
		}

		default int deleteVehicle(ArrayList<DriverBean> db )
		{
			return 0;
		}
		default boolean updateVehicle(DriverBean vb)
		{
			return false;
		}
		default ArrayList<DriverBean> findAll()
		{
			return null;
			
		}


}
