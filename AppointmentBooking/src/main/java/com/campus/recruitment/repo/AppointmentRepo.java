package com.campus.recruitment.repo;

import com.campus.recruitment.model.AppointmentModel;

public interface AppointmentRepo {
	public boolean isAddAppointment(AppointmentModel model,String filename);
}
