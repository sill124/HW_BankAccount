/**
 * BankAccount class implements an application that
 * simply displays Account information based on the multiple classes
 * 
 * @author Younho An
 * @version 0.0.1
 * @since 2022-04-24
 */

public class BankAccount {
	
	/**
	 * data member for Account owner's name(String)
	*/
	private String ownerName;
	
	/**
	 * data member for Account balance(double)
	*/
	private double balance;

	/**
	 * assigns the name of this Account's owner
	 * @param name set the owner's name into data member
	*/	
	public void setOwnerName(String name) {
		ownerName = name;
	}
	
	/**
	 * Return the name of this Account's owner
	 * @return ownerName
	*/
	public String getOwnerName() {
		return ownerName;
	}
	
	/**
	 * assigns the name of this Account's balance
	 * @param ranbalance set the InitialBalance into data member (0~50000)
	*/	
	public void setInitialBalance(double ranbalance) {
		balance = ranbalance;
	}
	
	/**
	 * Return the balance of this Account
	 * @return balance
	*/
	public double getBalance() {
		return balance;
	}
	
	/**
	 * 	 add the amount from your account.
	 * @param amount sets how much to add to the data member.
	*/	
	public double addBalance(double amount) {
		double oldBalance = balance;
		balance += amount;
		assert balance > oldBalance :
			"Serious Error - balance did not increase after deposit";
		return balance;
	}
	
	/**
	 * Deduct the amount from your account.
	 * @param amount sets how much to deduct to the data member.
	*/	
	public double deductBalance(double amount) {
		double oldBalance = balance;
		balance -= amount;
		assert balance < oldBalance : 
				"Serious Error - balance did not decrease after deposit";
		return balance;
	}
}

