package testing;
//import java.util.Scanner;
import java.util.Calendar;

public class CheckingAcc {
	private double balance;
	private String date,Name,phone,address;
	private int accNo;
	public void inititalize(String nam,String dat,String ph,String addr,int accN,double bal) {
		Name=nam;
		date=dat;
		phone=ph;
		address=addr;
		balance=bal;
		accNo=accN;
	}
	CheckingAcc(){
		
	}
	public int getAccNo(){
		return accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void makeDeposit(double dep) {
		balance=balance+dep;
	}
	public boolean makeWithdrawal(double amt) {
		balance=balance-amt;
		return true;
	}
	public void generateTranscript(double amtded) {
		Calendar date1=Calendar.getInstance();

		System.out.print("Account Number is  : "+accNo);
		System.out.print("Name of customer : "+Name);
		System.out.print("date of creation : "+date);
		System.out.print("address of customer : "+address);
		System.out.print("Phone no : "+phone);
		System.out.print("amount of transaction : "+amtded);
		System.out.print("date of transaction : "+date1.getTime());
		System.out.print("amount after transaction : "+balance);
		
	}
	public void transferAmount(CheckingAcc obj2,double amt) {
		makeWithdrawal(amt);
		obj2.makeDeposit(amt);
	}
	public double CalculateZakat(double currentBal) {
		if(currentBal<20000.0) {
			System.out.print("You Must have atleast an amount of  20,000 to be eligible for zakat");
			return 0;
		}
		return ((currentBal*2.5)/100);
	}
	public void amountded() {
		balance-=10;
	}
	public void menu() {
		System.out.print("\nWhat operation would you like to perform : \n");
		System.out.print("Press 1 to make a Deposit \n");
		System.out.print("Press 2 to make a Withdrawal \n");
		System.out.print("Press 3 to Transfer amount to another account \n");
		System.out.print("Press 4 to print statement \n");
		System.out.print("Press 5 to check Balance \n");
		System.out.print("Press 6 to close the account \n");
	}
}
