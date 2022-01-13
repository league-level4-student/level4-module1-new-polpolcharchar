package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {

	
	public ArrayList<Patient> patients; 

	Doctor(){
		patients = new ArrayList<Patient>();
	}
	
	public void doMedicine() {
		for(Patient p : patients) {
			p.checkPulse();
		}
	}
	
	
	public void assignPatient(Patient p) throws DoctorFullExtention {
		if(patients.size() >= 3) {
			throw new DoctorFullExtention();
		}else {
			patients.add(p);
		}
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	
	
}
