package com.mayur.web.doctor.service;

import java.util.List;

import com.mayur.web.doctor.entity.DoctorEntity;

public interface PatientService {
	
	public void insertRecord(DoctorEntity doctor);

	public List<DoctorEntity> getRecords();

}
