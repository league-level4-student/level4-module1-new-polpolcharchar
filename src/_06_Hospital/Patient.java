package _06_Hospital;

public class Patient {

	private boolean caredFor = false;
	
	public boolean isFeelsCaredFor() {
		return caredFor;
	}
	
	public void checkPulse() {
		caredFor = true;
	}
	
	
}
