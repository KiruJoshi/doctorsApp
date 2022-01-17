package com.mayur.web.doctor.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mayur.web.doctor.entity.DoctorEntity;

public interface PatientDAO {

	@Transactional
	public void insertRecord(DoctorEntity patient);
	
	/*
	 * @Transactional public void insertRecord2(DoctorEntity patient);
	 * 
	 * 
	 * public List<DoctorEntity> getRecords();
	 */

}
