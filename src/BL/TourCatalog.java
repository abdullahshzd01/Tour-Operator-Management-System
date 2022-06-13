package BL;

import java.util.ArrayList;

public class TourCatalog {

	ArrayList<Tour> tours;
	int current_ID;
	
	public TourCatalog(){
		
		System.out.println("Tour catalog created!");
		
		current_ID = 0;
		tours = new ArrayList<Tour>();
		
	}
	

	
	public Tour getTour(int TourID) {
		
		for(int i = 0; i < tours.size(); i++) {
			
			if(tours.get(i).tourID == TourID)
				return tours.get(i);
			
		}
		
		return null;
		
	}
	
	public boolean addTour(String departurePoint, String destinationPoint, int dateEveryMonth, int ticketPrice, int number_of_seats) {
		
		Tour current_tour = new Tour(this.current_ID, departurePoint, destinationPoint, dateEveryMonth, ticketPrice, number_of_seats);
		this.tours.add(current_tour);
		
		PersistanceFactory.getInstance().PH.storeInfo(current_tour);
		
		current_ID++;
		return true;
		
	}
	
}
