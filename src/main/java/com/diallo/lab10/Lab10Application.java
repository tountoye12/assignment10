package com.diallo.lab10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab10Application {



	public static void main(String[] args) {

		SpringApplication.run(Lab10Application.class, args);

	}

//	@Override
//	public void run(String... args) throws Exception {
//
////		System.out.println("Test");
//		Patient gillian = new Patient(null, "P001",
//				"Gillian White", null, null);
//
//		Appointment gillian_Appointment = new Appointment(null,
//				LocalDate.now(), gillian, null, null);
//		Surgery surgery_S15 = new Surgery(null, "S15", null, null);
//
//		Dentist dentist = new Dentist(null, "Tony Smith", null);
//		gillian_Appointment.setPatient(gillian);
//		gillian_Appointment.setSurgery(surgery_S15);
//		gillian_Appointment.setDentist(dentist);
//
//		appointmentService.saveApointment(gillian_Appointment);
//	}
}
