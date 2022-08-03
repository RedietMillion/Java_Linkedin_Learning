public class Main{

	public static double salaryCalculator(double hoursPerWeek, double moneyPerHour, int vacationday){
		if (hoursPerWeek <= 0){
		return -1;}
		if (moneyPerHour <= 0){
			return -1;}
		double vacMoney = vacationday * moneyPerHour * 8;
		double weeklyCheck =  hoursPerWeek * moneyPerHour;
		return (weeklyCheck * 52) - vacMoney;
	}

	public static void main(String[] args){
		System.out.println("The amount of your monthly salary is:" +  salaryCalculator(8, 6.5, 8));
	}

}
