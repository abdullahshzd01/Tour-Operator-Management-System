package BL;

import java.util.Date;

public class Reservation {
	
	int reservationID;
	Client Bookie;
	Tour whichTour;
	int number_of_seats;
	Date departure;
	String pickupPoint;
	Payment payment;
	Reciept reciept;
	

	public Reservation(int reservation_id, Client client, Tour tour, int number_of_people, Date departDate, String pickupPoint) {
		
		
		this.reservationID = reservation_id;
		this.Bookie = client;
		this.whichTour = tour;
		this.number_of_seats = number_of_people;
		this.departure = departDate;
		this.pickupPoint = pickupPoint;
		
	}
	
	
	public Client getBookie() {
		return Bookie;
	}
	public void setBookie(Client bookie) {
		Bookie = bookie;
	}
	public Tour getWhichTour() {
		return whichTour;
	}
	public void setWhichTour(Tour whichTour) {
		this.whichTour = whichTour;
	}
	public int getNumber_of_seats() {
		return number_of_seats;
	}
	public void setNumber_of_seats(int number_of_seats) {
		this.number_of_seats = number_of_seats;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Reciept getReciept() {
		return reciept;
	}
	public void setReciept(Reciept reciept) {
		this.reciept = reciept;
	}
	
	public boolean makePayment(String paymentMethod) {
		
		return PaymentFactory.getInstance(paymentMethod).PH.makePayment(payment);
		
	}

}
