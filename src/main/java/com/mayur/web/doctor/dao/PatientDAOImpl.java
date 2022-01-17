package com.mayur.web.doctor.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mayur.web.doctor.entity.DoctorEntity;

@Repository
//public class PatientDAOImpl extends GenericDAO implements PatientDAO{
public class PatientDAOImpl implements PatientDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private SessionFactory sessionFactory;

	// This method can be used if our primary key is auto-increamented.
	public void insertRecord(DoctorEntity patient) {
		

		Session session = sessionFactory.openSession();
		session.save(patient);

	}


}
