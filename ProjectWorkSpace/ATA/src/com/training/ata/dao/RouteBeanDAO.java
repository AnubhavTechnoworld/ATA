package com.training.ata.dao;

import java.util.ArrayList;

import com.training.ata.bean.RouteBean;

public interface RouteBeanDAO {
	
	default RouteBean findByID(RouteBean rtb)
		{
			return rtb;
			
		}
		
		default String createVehicle(RouteBean rtb) {
			return null;
		}

		default int deleteVehicle(ArrayList<RouteBean> rtb )
		{
			return 0;
		}
		default boolean updateVehicle(RouteBean rtb)
		{
			return false;
		}
		
		default ArrayList<RouteBean> findAll()
		{
			return null;
			
		}

}
