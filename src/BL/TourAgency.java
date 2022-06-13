package BL;

import java.util.Date;
import java.util.HashMap;

public class TourAgency {
	
	TourCatalog TC;
	ReservationsRegister RR;
	ClientRecords CR;
	
	public TourAgency(){
		
		System.out.println("Tour Agency CREATED");
		
		TC = new TourCatalog();
		RR = new ReservationsRegister();
		CR = new ClientRecords();
		
	}
	
	public boolean addTour(String departurePoint, String destinationPoint, int dateEveryMonth, int ticketPrice, int number_of_seats) {
		
		return TC.addTour(departurePoint, destinationPoint, dateEveryMonth, ticketPrice, number_of_seats);
	
	}

	public int makeReservation(String clientCNIC, int tourID, int number_of_people, String pickupPoint, Date date) {
		
		Tour currentTour = TC.getTour(tourID);
		Client currentClient = CR.getClient(clientCNIC);
		
		if(currentTour == null || currentClient  == null) {
		
			if(currentTour == null)
				System.out.println("Current Tour is NULL");
			else if(currentClient == null)
				System.out.println("Current Client is NULL");
			else
				System.out.println("Both CT and CC are NULL");
			
			return -1;
			
		}
		
		
		RR.makeReservation(currentClient, currentTour, number_of_people, date, pickupPoint);
		
		return 0;
		
		
	}
	
	public boolean registerClient(String name, String cnic, int age, String contactNo, String email) {
		
		CR.registerClient(name, cnic, age, contactNo, email);
		
		return true;
		
		
	}
	
	public boolean MakeBookingCancelation(int reservation_id)
	{
	
		
		System.out.println("Before cancellation");
		for(int i=0;i<RR.reservations.size();i++)
		{
			System.out.println("client cnic: " + RR.reservations.get(i).getBookie().CNIC);
		}
		
		RR.CancelReservation((reservation_id));
		
		System.out.println("After cancellation");
		for(int i=0;i<RR.reservations.size();i++)
		{
			System.out.println("client cnic: " + RR.reservations.get(i).getBookie().CNIC);	
		}
		
		return true;
		
	}
	
	public Reservation SearchReservationDetails(String booking_id)
	{
		  
		  Reservation reserv;
		
		  reserv=RR.SearchReservationDetails(booking_id);
		 
		return reserv;
		
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("STARTED");
				
	}
	
	

}
