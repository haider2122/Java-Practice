import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 class Account implements Comparable<Account>
{
	private int accountNumber;
    private String accountType;// Savings Current
    private float balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Account(int accountNumber, String accountType, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance
				+ "]";
	}
	@Override
	public int hashCode() {
		return this.accountNumber;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNumber != other.accountNumber)
            return false;
        return true;
	}
	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	
	 @Override
	    public int compareTo( final Account acct) {
		  int r=Integer.compare(this.getAccountNumber(), acct.accountNumber);
		//  System.out.println("r:"+r);
	       return r;
	       
		
	    }
	
}
 class Customer {
	private String mobileNo;
	private String address;
	private int pincode;
	private String accountHolderName;
	
	public Customer(String mobileNo, String address, int pincode, String accountHolderName) {
		super();
		this.mobileNo = mobileNo;
		this.address = address;
		this.pincode = pincode;
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Customer [mobileNo=" + mobileNo + ", address=" + address + ", pincode=" + pincode
				+ ", accountHolderName=" + accountHolderName + "]";
	}
	
	

}

public class Map_Project_SessionWork {

	public static void main(String [] args){
		

		Account a1=new Account(10001,"Savings",4000);
		Account a2=new Account(10002,"Savings",4000);
		Account a3=new Account(10003,"Savings",4000);
		Account a4=new Account(10004,"Savings",5000);
		Account a5=new Account(10005,"Current",7000);
		
		Customer c1=new Customer("9453453443","Bangalore",560001,"Smith");
		Customer c2=new Customer("9345345344","Bangalore",560001,"Pritam");
		Customer c3=new Customer("9864534777","Chennai",600001,"Surya");
		Customer c4=new Customer("9843543434","Bangalore",560001,"Ashish");
		
		Map<Account,Customer> mapAccCust=new TreeMap<>();
		
		mapAccCust.put(a3, c3);
		mapAccCust.put(a1, c1);
		mapAccCust.put(a2, c2);
		mapAccCust.put(a5, c4);
		mapAccCust.put(a4, c4);
		
		for(int i=0;i<3;i++)
		{
		System.out.println("Enter account no to be searched:");
		Scanner scan =new Scanner(System.in);
        int accno=Integer.parseInt(scan.nextLine());
		Account searchAccount=new Account(accno);		
		
		Customer cust=mapAccCust.get(searchAccount);
		if(cust!=null)
			System.out.println(cust.toString());
		else
			System.out.println("Not found");
		
		}
		
		System.out.println("-------------------------------------------");
		for(Map.Entry<Account,Customer> entry : mapAccCust.entrySet()) 
		{
			  Account key = entry.getKey();
			  Customer value = entry.getValue();
			  System.out.println("Account:  => " +key.toString() );
			  System.out.println("Customer:  => " +value.toString() );
			  System.out.println("*************************");
	}
	
}



