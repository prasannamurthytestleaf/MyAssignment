package collegeStudents;

public class StudentInformation {

	/**
	 * Student Information
	 * @param ID
	 */
	public void getStudentInfo(int ID) {
		System.out.println(ID);
	}

	/**
	 * Student Information
	 * @Enter ID and Name
	 */

	public void getStudentInfo(int ID, String name) {
		System.out.println(ID+"-"+name);

	}
	/**
	 * Student Information
	 * @param E-mail
	 * @param Phone number
	 */
	public void getStudentInfo(String Email, String PhoneNumber) {
		System.out.printf(Email+"-"+PhoneNumber);

	}
	public static void main(String[] args) {
		StudentInformation obj=new StudentInformation();
		obj.getStudentInfo(126);
		obj.getStudentInfo(126, "Prasannamurthy K");
		obj.getStudentInfo("Prasannakrish03@gmail.com", "9789926144");
	}
}

