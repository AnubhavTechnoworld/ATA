package com.training.ata.service;

import java.util.ArrayList;

import com.training.ata.bean.ReservationBean;
import com.training.ata.bean.RouteBean;
import com.training.ata.bean.VehicleBean;

public interface Customer {
	
	ArrayList<VehicleBean>  viewVehiclesByType = new ArrayList<>();
	ArrayList<VehicleBean> viewVehicleBySeats=new ArrayList<>();
	default ArrayList<RouteBean> viewAllRoutes()
	{
		return null;
		
	}
	 default String bookVehicle(ReservationBean reservationBean)
	{
		return null;
		
	}
	 default boolean cancelBooking(String userID, String reservationID)
	 {
		return false;
	
	 }
	
	default ReservationBean viewBookingDetails(String reservationID)
	{
		return null;
		
	}
	default ReservationBean printBookingDetails(String reservationID)
	{
		return null;
		
	}
	
}
