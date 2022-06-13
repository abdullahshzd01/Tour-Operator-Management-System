package BL;

import java.util.Date;

public class Payment {
	
	int amount;
	boolean recieved;
	Date paymentDate;
	

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean isRecieved() {
		return recieved;
	}
	public void setRecieved(boolean recieved) {
		this.recieved = recieved;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

}
