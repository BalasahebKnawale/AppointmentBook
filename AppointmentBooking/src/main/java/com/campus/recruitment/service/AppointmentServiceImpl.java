package com.campus.recruitment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.recruitment.model.AppointmentModel;
import com.campus.recruitment.repo.AppointmentRepo;

@Service
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	AppointmentRepo repo;
	
	@Override
	public boolean isAddAppointment(AppointmentModel model, String filename) {
		// TODO Auto-generated method stub
		return repo.isAddAppointment(model, filename);
	}

}
