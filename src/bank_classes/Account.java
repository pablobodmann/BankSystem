package bank_classes;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Account.java
//  @ Date : 01/06/2013
//  @ Author : 
//
//




public class Account {
	private String account_code;
	private String branch_code
	private Money initial_balance;
	private History history;
	
	public Account(String account_code, String branch_code, Money initial_balance){
	    this.account_code = account_code;
	    this.branch_code = branch_code;
	    this.initial_balance = initial_balance;
	}
		
	public Number get_balance() {
		private Number liquid_balance;
		liquid_balance=inital_balance + history.sum_transaction_values();	
		return liquid_balance;
	}
	
	public History get_history() {
	       return history;
	}
	
	public void add_to_history(Transaction t) {
	       history.store_transaction(t);
	}
	
	public String get_branch_code() {
		return branch_code;	
	}
	public String get_acc_code(){
		return account_code;
	}
}
