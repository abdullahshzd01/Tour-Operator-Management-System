package BL;

import java.util.ArrayList;

public class ClientRecords {
	
	ArrayList<Client> clients;
	
	public ClientRecords() {
		
		clients = new ArrayList<Client>();
		
	}
	
	boolean registerClient(String name, String cnic, int age, String contactNo, String email) {
		
		Client currentClient = new Client(name, cnic, age, contactNo, email);
		clients.add(currentClient);
		
		System.out.println("Client added!");
		
		System.out.println("Client is" + getClient(cnic).name);
		PersistanceFactory.getInstance().storeInfo(currentClient);
		
		return true;
		
	}
	
	public Client getClient(String CNIC) {
		
		for(int i = 0; i < clients.size(); i++) {
			
			if(clients.get(i).CNIC.equals(CNIC))
				return clients.get(i);
			
		}
		
		return null;
		
	}
	
}
