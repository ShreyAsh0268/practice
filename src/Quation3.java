/*
 * Q 3) Design a Class for Bank Account
Problem:  Create a BankAccount class with attributes like accountNumber, accountHolderName, and balance. Provide methods to deposit, withdraw, and check the balance. Implement this with proper encapsulation.

Requirements:
Deposit method to add money to the balance.
Withdraw method to withdraw money (ensure balance doesn't go negative).
Getter and setter methods for account attributes.

 */
import java.util.*;
class BankAccount
{
	String accountNumber;
	String accountHolderName;
	int balance;
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public int getBalance()
	{
		return balance;
	}
}
class Operation
{
	Scanner s=new Scanner(System.in);
	BankAccount bank;
	void setDetails(BankAccount bank)
	{
		this.bank=bank;
	}
	public void deposit()
	{
		System.out.println("Enter Deposit ammount");
		int da=s.nextInt();
		int balance=bank.getBalance();
		
		System.out.println("After Transection");
		System.out.println(bank.getAccountHolderName()+"\t"+bank.getAccountNumber()+"\t"+balance);
	}
	public void withdraw()
	{}
}
public class Quation3 {
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=s.nextLine();
		System.out.println("Enter Account Number");
		String anumber=s.nextLine();
		System.out.println("Enter Balance");
		int balance=s.nextInt();
		
		BankAccount bac=new BankAccount();
		bac.setAccountHolderName(name);
		bac.setAccountNumber(anumber);
		bac.setBalance(balance);
		
		Operation op = new Operation();
		op.deposit();
	}
}
