public class StudentProfile{

	String firstName;
	String lastName;
	String declarMajor;
	double gpa;
	int expectedYearToGraduate;

	public StudentProfile( String firstName, String lastName, String declarMajor, double gpa, int expectedYearToGraduate){
	this.firstName = firstName;
	this.lastName = lastName;
	this.declarMajor = declarMajor;
	this.expectedYearToGraduate = expectedYearToGraduate;
	}
	public void incremenetExpectedGraduationYear(){
	this.expectedYearToGraduate = expectedYearToGraduate +1;
	}

}
