package _06_Hospital;

import java.util.ArrayList;

public class Hospital {

	
	ArrayList<Doctor> doctors;
	ArrayList<Patient> unassignedPatients;

	Hospital(){
		doctors = new ArrayList<Doctor>();
		unassignedPatients = new ArrayList<Patient>();
	}
	
	
	public void addDoctor(Doctor d) {
		doctors.add(d);

	}
	
	public ArrayList<Doctor> getDoctors(){
		return doctors;
	}
	
	public void addPatient(Patient p) {
		unassignedPatients.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return unassignedPatients;
	}
	
	public void assignPatientsToDoctors() throws DoctorFullExtention {

		int currentDoctor = 0;
		while(unassignedPatients.size() != 0) {
			doctors.get(currentDoctor).assignPatient(unassignedPatients.remove(0));
			if(doctors.get(currentDoctor).getPatients().size() == 3) {
				currentDoctor++;
			}
		}
	}
	
}
