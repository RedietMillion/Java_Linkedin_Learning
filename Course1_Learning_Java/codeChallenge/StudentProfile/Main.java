public class Main{

	public static void main(String[] args){
	StudentProfile profileOne = new StudentProfile("Rediet", "Million","Math", 3.5, 2022);
	StudentProfile profileTwo = new StudentProfile("Beti", "Haile","Accouunting", 3.9, 2023);
	profileTwo.incremenetExpectedGraduationYear();
	System.out.println(profileTwo.expectedYearToGraduate);
	
	}
}
