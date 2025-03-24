package com.tp.ThymeCare;

import com.tp.ThymeCare.model.Patient;
import com.tp.ThymeCare.repository.PatientRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class HospitalApplication {
	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(PatientRepo patientRepository) {
		return args -> {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			Patient p1 = new Patient(0, "Oussama", sdf.parse("1995-04-12"), "Flu", 85);
			Patient p2 = new Patient(0, "mreckah", sdf.parse("1980-07-22"), "Diabetes", 72);
			Patient p3 = new Patient(0, "NABBAR", sdf.parse("1975-09-10"), "Hypertension", 90);
			Patient p4 = new Patient(0, "Oussama", sdf.parse("1995-04-12"), "Flu", 85);
			Patient p5 = new Patient(0, "mreckah", sdf.parse("1980-07-22"), "Diabetes", 72);
			Patient p7 = new Patient(0, "NABBAR", sdf.parse("1975-09-10"), "Hypertension", 90);
			Patient p6 = new Patient(0, "Oussama", sdf.parse("1995-04-12"), "Flu", 85);
			Patient p8 = new Patient(0, "mreckah", sdf.parse("1980-07-22"), "Diabetes", 72);
			Patient p9 = new Patient(0, "NABBAR", sdf.parse("1975-09-10"), "Hypertension", 90);
			Patient p10 = new Patient(0, "Oussama", sdf.parse("1995-04-12"), "Flu", 85);

			patientRepository.save(p1);
			patientRepository.save(p2);
			patientRepository.save(p3);
			patientRepository.save(p4);
			patientRepository.save(p5);
			patientRepository.save(p7);
			patientRepository.save(p6);
			patientRepository.save(p8);
			patientRepository.save(p9);
			patientRepository.save(p10);

			System.out.println("✅ 3 patients added successfully!");
		};
	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
