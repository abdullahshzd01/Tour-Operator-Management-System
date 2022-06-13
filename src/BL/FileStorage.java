package BL;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileStorage extends PersistanceHandler{

	//fileptr
	FileWriter FilePTR;
	String clientFileName;
	String tourFileName;
	String reservationFileName;
	public FileStorage() {
		
		clientFileName = "clientData.txt";
		tourFileName = "tourData.txt";
		reservationFileName = "reservationData.txt";
			
	}
	
	public boolean storeInfo(Client c)  {
		
		try {
			
			FilePTR = (new FileWriter(clientFileName, true));
			
			BufferedWriter bw = new BufferedWriter(FilePTR);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.print(c.CNIC);
			pw.print('#');
			pw.print(c.name);
			pw.print('#');		
			pw.print(c.age);
			pw.print('#');
			pw.print(c.contactNumber);
			pw.print('#');
			pw.print(c.email);
			pw.print('\n');
			
			pw.close();
			bw.close();
			FilePTR.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return true;
		
	}
	
	public boolean storeInfo(Tour t)  {
		
		try {
			
			FilePTR = (new FileWriter(tourFileName, true));
			
			BufferedWriter bw = new BufferedWriter(FilePTR);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.print(t.tourID);
			pw.print('#');
			pw.print(t.ticketPrice);
			pw.print('#');		
			pw.print(t.dateEveryMonth);
			pw.print('#');
			pw.print(t.departurePoint);
			pw.print('#');
			pw.print(t.destinationPoint);
			pw.print('#');
			pw.print(t.number_of_seats_available);
			pw.print('#');
			pw.print(t.number_of_seats_reserved);
			pw.print('\n');
			
			pw.close();
			bw.close();
			FilePTR.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		}	
		
		public boolean storeInfo(Reservation r)  {
			
			try {
				
				System.out.println("Registration File writing ");
				FilePTR = (new FileWriter(reservationFileName, true));
				
				BufferedWriter bw = new BufferedWriter(FilePTR);
				PrintWriter pw = new PrintWriter(bw);
				
				pw.print(r.reservationID);
				pw.print('#');
				pw.print(r.whichTour.tourID);
				pw.print('#');		
				pw.print(r.Bookie.CNIC);
				pw.print('#');
				pw.print(r.number_of_seats);
				pw.print('#');
				pw.print(r.departure);
				pw.print('#');
				pw.print(r.pickupPoint);
				pw.print('\n');
				
				pw.close();
				bw.close();
				FilePTR.close();
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return true;
		
	}
	
}
