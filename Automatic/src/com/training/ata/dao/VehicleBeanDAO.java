package com.training.ata.dao;


import java.util.ArrayList;


import com.training.ata.bean.VehicleBean;

public interface VehicleBeanDAO {
	
	
	

	default VehicleBean findByID(VehicleBean vb)
	{
		return vb;
		
	}
	
	default String createVehicle(VehicleBean vb) {
		return null;
	}

	default int deleteVehicle(ArrayList<VehicleBean> vb )
	{
		return 0;
	}
	default boolean updateVehicle(VehicleBean vb)
	{
		return false;
	}
	default ArrayList<VehicleBean> findAll()
	{
		return null;
		
	}

}
	