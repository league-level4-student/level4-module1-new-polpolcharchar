package _06_Hospital;

import java.util.ArrayList;

public class Hospital {

	
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	public ArrayList<Doctor> getDoctors(){
		return doctors;
	}
	
	public void addPatient(Patient p) {
		
	}
	
	public ArrayList<Patient> getPatients() {
		return unassignedPatients;
	}
	
	public void assignPatientsToDoctors() throws DoctorFullExtention {
		int currentDoctor = 0;
		while(unassignedPatients.size() != 0 && doctors.get(currentDoctor).getPatients().size() <3) {
			doctors.get(currentDoctor).assignPatient(unassignedPatients.remove(0));
		}
	}
	
}
