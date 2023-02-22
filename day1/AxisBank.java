package week3.ass.day1;

public class AxisBank extends BankInfo {
	
	public  void deposit(int x) {
		System.out.println("deposit amount is"+x);
	}

	public static void main(String[] args) {
		

		AxisBank amount=new AxisBank();
		amount.deposit(4000);
		amount.fixed(8000);
		amount.saving(20000);
		
	}
	

}
