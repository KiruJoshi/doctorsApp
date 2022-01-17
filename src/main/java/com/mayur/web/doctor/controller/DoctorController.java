package com.mayur.web.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mayur.web.doctor.entity.DoctorEntity;
import com.mayur.web.doctor.service.PatientService;



@Controller
public class DoctorController {
	
	@Autowired
	PatientService patientService;

	@GetMapping("/getAppointmentFormPage")
	public String getPatientPage(Model model) {
		DoctorEntity doctor = new DoctorEntity();
		model.addAttribute("doctor", doctor);
		return "patient";
	}

//This is PRG-Post Redirect Get Design Pattern
	@PostMapping(value="/addPatientDetails")
	public String insertRecord(@ModelAttribute DoctorEntity doctor) {

		System.out.println(doctor);
		
		patientService.insertRecord(doctor);
		return "redirect:/getSuccessPage";
	

	}
	
	
	
	
	
	@GetMapping("/getSuccessPage")
	public String getSuccessPage() {
		
		return "success";
	}
	

}
