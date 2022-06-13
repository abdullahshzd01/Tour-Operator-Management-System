package BL;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


public class PersistanceFactory {
	
	static PersistanceFactory PF;
	PersistanceHandler PH;
	
	private PersistanceFactory() {
		
		String storage = this.getPropertiesValue();
		
		System.out.println("MAKING PERSISTANCEFACTORY of type: " + storage);
		
		if(storage.equals("File")) {
			
			System.out.println("File storage created");
			PH = new FileStorage();
			
			if (PH != null) {
				
				System.out.println("File storage created");
				
			}
			else {
				
				System.out.println("PH IS STILL NULL");
				
			}
			
		}
		else if(storage.equals("OracleDB")) {
			
			PH = new OracleDBStorage();
			
		}
		else if(storage.equals("MySQL")) {
			
			PH = new MySQLStorage();
		}

	}
	
	public String getPropertiesValue() {
		

		String result = "";
		InputStream inputStream;
		
		try {
	
			Properties prop = new Properties();
			String propFileName = "config.properties";
	
			inputStream = (getClass().getResourceAsStream(propFileName));
			//inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
	
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
	
			// get the property value and print it out
			String storage = prop.getProperty("storage");

			result = storage;
				
		} catch (Exception e) {
		
			System.out.println("Exception: " + e);
	
		} 
		
		System.out.println("Storage type: " + result);
		
		return result;
}
	
	public static PersistanceFactory getInstance() {
		
		if(PF == null) {
		
			System.out.println("PF IS INITIALLY NULL");
			PF = new PersistanceFactory();
			
		}
		
		return PF;
		
	}
	
	public boolean storeInfo(Client c) {
		
		PH.storeInfo(c);
		
		return true;
		
	}

}
