package com.mayur.web.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayur.web.doctor.dao.*;
import com.mayur.web.doctor.entity.*;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientDAO patientDao;
	
	

	
	
	  public void insertRecord(DoctorEntity patient) {
	  
	  patientDao.insertRecord(patient); 
	  }
	 


	public List<DoctorEntity> getRecords() {
		
		/*
		 * List<DoctorEntity> patientList =patientDao.getRecords();
		 * 
		 * emailDAOobj.sendEmail(patientList);
		 * 
		 * return patientList;
		 * 
		 */
		return null;
	}

}
