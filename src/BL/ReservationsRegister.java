package BL;

import java.util.ArrayList;
import java.util.Date;


public class ReservationsRegister {

	ArrayList<Reservation> reservations;
	int currentReservationID;
	
	public ReservationsRegister() {
		System.out.println("RR CREATED");
		this.reservations = new ArrayList<Reservation>();
		this.currentReservationID = 0;
		
		
	}
	public Reservation SearchReservationDetails(String booking_id){
		  
		
		
		Reservation searchDetails = null;
		
		for(int i=0;i<reservations.size();i++)
		{
			if(booking_id==reservations.get(i).getBookie().getCNIC())
			{
				searchDetails=new Reservation(reservations.get(i).reservationID,reservations.get(i).Bookie,reservations.get(i).whichTour,reservations.get(i).number_of_seats,reservations.get(i).departure,reservations.get(i).pickupPoint);
				
				
			}
			
		}

			
	
		if (searchDetails != null)
			return searchDetails;
		else
			return null;
	}
	
	//return reservation ID
	public int makeReservation(Client client, Tour tour, int number_of_people, Date departDate, String pickupPoint) {
		
		if(number_of_people > tour.number_of_seats_available)
			return -1;
		
		Reservation currentReservation = new Reservation(this.currentReservationID,client, tour, number_of_people, departDate, pickupPoint);
		this.currentReservationID++;
		
		//decreasing seats available
		tour.number_of_seats_available -= number_of_people;
		
		//adding to array list
		reservations.add(currentReservation);
		PersistanceFactory.getInstance().PH.storeInfo(currentReservation);
		
		client.clientReservations.add(currentReservation);
		
		System.out.println("Added a reservation with ID: " + Integer.toString(currentReservation.reservationID));
		
		return currentReservation.reservationID;

	}
	
	@SuppressWarnings("unused")
	public boolean CancelReservation(int reserv_id){
		
		Client currentClient = null;
		
		for(int i=0;i<reservations.size();i++)
		{
			
			if(reservations.get(i).reservationID == reserv_id)
			{
				currentClient = reservations.get(i).Bookie;
				
				reservations.remove(i);
				
				System.out.print("Reservation is cancelled");
				return true;
			}
		}
		
		if(currentClient != null) {
			
		
			for(int i = 0; i < currentClient.clientReservations.size();i++) {
				
				if(currentClient.clientReservations.get(i).reservationID == reserv_id) {
					
					currentClient.clientReservations.remove(i);
					
				}
				
			}
		}
		return false;
		
	}
	
}
