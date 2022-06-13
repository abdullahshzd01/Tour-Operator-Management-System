package BL;

public class Tour {

	int tourID;
	
	String departurePoint;
	String destinationPoint;
	
	int dateEveryMonth;
	
	int ticketPrice;
	
	int number_of_seats_available;
	int number_of_seats_reserved;

	TourDesc tourDescription;
	
	public void displayCreated(Tour t) {
		
		System.out.println("Tour ID: " + t.tourID);
		System.out.println("DateEveryMonth: " + t.dateEveryMonth);
		System.out.println("Departure: " + t.departurePoint);
		System.out.println("Destination: " + t.destinationPoint);
		System.out.println("Seats: " + t.number_of_seats_available);
		System.out.println("Price: " + t.ticketPrice);
		
		
	}
	
	public Tour(int tourID2, String departurePoint2, String destinationPoint2, int dateEveryMonth2, int ticketPrice2, int number_of_seats) 
	{
		
		this.tourID = tourID2;
		this.departurePoint = departurePoint2;
		this.destinationPoint = destinationPoint2;
		this.dateEveryMonth = dateEveryMonth2;
		this.ticketPrice = ticketPrice2;
		this.number_of_seats_available = number_of_seats;
		
		displayCreated(this);
	
	}
	
	public String getDeparturePoint() {
		return departurePoint;
	}
	public void setDeparturePoint(String departurePoint) {
		this.departurePoint = departurePoint;
	}
	public String getDestinationPoint() {
		return destinationPoint;
	}
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	public int getDateEveryMonth() {
		return dateEveryMonth;
	}
	public void setDateEveryMonth(int dateEveryMonth) {
		this.dateEveryMonth = dateEveryMonth;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getNumber_of_seats_available() {
		return number_of_seats_available;
	}
	public void setNumber_of_seats_available(int number_of_seats_available) {
		this.number_of_seats_available = number_of_seats_available;
	}
	public int getNumber_of_seats_reserved() {
		return number_of_seats_reserved;
	}
	public void setNumber_of_seats_reserved(int number_of_seats_reserved) {
		this.number_of_seats_reserved = number_of_seats_reserved;
	}
	
	
	
	
}
