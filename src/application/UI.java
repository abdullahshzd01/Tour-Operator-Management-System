package application;

import java.io.IOException;
import java.time.ZoneId;
import java.util.Date;

import BL.Reservation;
import BL.TourAgency;
import BL.TourCatalog;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;

public class UI extends Main{
			
	    @FXML
	    private Text deletemsg;
	    
	  @FXML
	    private TextField bustype;

	    @FXML
	    private TextField food;

	    @FXML
	    private TextField varDayofMonth;

	    @FXML
	    private TextField varDpoint;

	    @FXML
	    private TextField varItinerary;

	    @FXML
	    private TextField varSetSeats;

	    @FXML
	    private TextField varTourID;

	    @FXML
	    private TextField vardays;

	    @FXML
	    private TextField vardes;

	    @FXML
	    private TextField varguidlines;

	    @FXML
	    private TextField varprice;

	    @FXML
	    private TextField editDayofMonth;

	    @FXML
	    private TextField editDpoint;

	    @FXML
	    private TextField editItinerary;

	    @FXML
	    private TextField editSetSeats;

	    @FXML
	    private TextField editTourID;

	    @FXML
	    private TextField editdays;

	    @FXML
	    private TextField editfood;

	    @FXML
	    private TextField editguidlines;

	    @FXML
	    private TextField editprice;

	    @FXML
	    private TextField edittype;

	    @FXML
	    private TextField editvardes;
	    
	    
	    @FXML
	    private TextField update_clientAge;

	    @FXML
	    private TextField update_clientCnic;

	    @FXML
	    private TextField update_clientEmail;

	    @FXML
	    private TextField update_clientName;

	    @FXML
	    private TextField update_clientcontact;
	    
	    
	    
	    @FXML
	    private TextField clientAge;

	    @FXML
	    private TextField clientCnic;

	    @FXML
	    private TextField clientEmail;

	    @FXML
	    private TextField clientName;

	    @FXML
	    private TextField clientcontact;

	    @FXML
	    private TextField b_client_id;

	    @FXML
	    private DatePicker b_date;

	    @FXML
	    private TextField b_no_of_people;

	    @FXML
	    private TextField b_pickupPoint;

	    @FXML
	    private TextField b_tour_id;
	    
	    
	    @FXML
	    private TextField del_client_id;
	    

	    @FXML
	    private TextField upTourID;


	    @FXML
	    private TextField cancelBookingID;

	    @FXML
	    private TextField editReservationClientID;

	    @FXML
	    private TextField editReservationNumberofPeople;

	    @FXML
	    private TextField editReservationPickupPoint;

	    @FXML
	    private TextField editReservationTourID;

	    @FXML
	    private TextField searchEditReservationID;

	    @FXML
	    void SearchReservationDetails(ActionEvent event) {
	    		System.out.println("Search reservation details called");
	    	
	    		@SuppressWarnings("unused")
				Reservation searchReservation = null;
	    		searchReservation=TA.SearchReservationDetails(searchEditReservationID.getText());
	    		System.out.println("client cnic"+ searchReservation.getBookie().getCNIC());
	    		System.out.println("client age "+ searchReservation.getBookie().getAge());
	    		
	    }

	    @FXML
	    void UpdateReservationDetails(ActionEvent event) {
	    	System.out.println("Update REservation details");

	    }

	    

	    
    
	public UI() {
				
	}
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	
	 
    @FXML
    public void switchToBookingOptions(ActionEvent event) throws IOException {
    	
    	  root = FXMLLoader.load(getClass().getResource("BookingOptions.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.show();
    	  
    }
    
    
    @FXML
    public void switchToVehicleOptions(ActionEvent event) throws IOException {
    	
    	  root = FXMLLoader.load(getClass().getResource("VehicleOptions.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.show();
    	  
    }
    
    @FXML
    public void switchToTourOptions(ActionEvent event) throws IOException {
    	
    	  root = FXMLLoader.load(getClass().getResource("TourOptions.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.show();
    	  
    }
    
    @FXML
    public void switchToManageFaculty(ActionEvent event) throws IOException {
    	
    	  root = FXMLLoader.load(getClass().getResource("ManageFaculty.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.show();
    	  
    }
    
    @FXML
    public void switchToAddTour(ActionEvent event) throws IOException {
    	
    	  root = FXMLLoader.load(getClass().getResource("AddTour.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.show();
    	  
    }

    @FXML
    public void switchToFrontPage(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("FrontPage.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }
    
    //switchToEditBookingDetails
    
    @FXML
    public void AddTourDetails(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("AddTour.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  	  
  	  TA.addTour(varDpoint.getText(), vardes.getText(), Integer.parseInt(varDayofMonth.getText()), Integer.parseInt(varprice.getText()), Integer.parseInt(varSetSeats.getText()));
  	
  	  
  }
    
    @FXML
    public void switchToEditTourDetails(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("EditTour.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  	  
  	 
  	  
  }
    

    
    @FXML
    public void EditTourDetails(ActionEvent event) throws IOException{
    	root = FXMLLoader.load(getClass().getResource("EditTour.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.show();
    	  
    		
    }
    
    @FXML
    public void DeleteTourDetails(ActionEvent event) throws IOException{
    	root = FXMLLoader.load(getClass().getResource("EditTour.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.show();
    	  
    		
    }
    
    @FXML
    public void MakeReservation(ActionEvent event) throws IOException{
    	root = FXMLLoader.load(getClass().getResource("MakeBooking.fxml"));
    	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	  scene = new Scene(root);
    	  stage.setScene(scene);
    	  stage.show();
    	  
    	  TA.makeReservation(b_client_id.getText(), Integer.parseInt(b_tour_id.getText()), Integer.parseInt(b_no_of_people.getText()), b_pickupPoint.getText(),  Date.from(b_date.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()));
    	  
    }
  
    
    
    @FXML
    public void switchToDeleteTourDetails(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("DeleteTour.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  	  
  	 
  	  
  }
    //for bookings
    
    @FXML
    public void switchToEditBookingDetails(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("UpdateBooking.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }
    
    @FXML
    public void switchToShowBooking(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("ShowBooking.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }
    
    @FXML
    public void switchToCancelBooking(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("CancelBooking.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }
    
    @FXML
    public void switchToMakeBooking(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("MakeBooking.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }
    
    //for manage clients
    
    @FXML
    public void switchToManageClients(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("ManageClients.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  	  
  	 
  	  
  }
    
    @FXML
    public void switchToMakeRegistration(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("MakeRegistration.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }
    


    @FXML
    void MakeBookingCancelation(ActionEvent event) throws IOException{
    	
    	System.out.println("Make Cancellation called");
    	
    	TA.MakeBookingCancelation(Integer.parseInt(cancelBookingID.getText()));
    }
    
    
    //change this naem to makeRegistration behghairataa
    @FXML
    public void ConfirmRegistration(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("MakeRegistration.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  	  TA.registerClient(clientName.getText(), clientCnic.getText(), Integer.parseInt(clientAge.getText()), clientcontact.getText(), clientEmail.getText());
  	  
  }
    
    @FXML
    public void switchToDeleteClient(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("DeleteClient.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }
    @FXML
    public void DeleteClient(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("DeleteClient.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }
    
    @FXML
    public void switchToEditClientDetails(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("EditClientDetails.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }
    
    @FXML
    public void UpdateClientDetails(ActionEvent event) throws IOException {
    	
  	  root = FXMLLoader.load(getClass().getResource("EditClientDetails.fxml"));
  	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  	  scene = new Scene(root);
  	  stage.setScene(scene);
  	  stage.show();
  	  
  }

    
    
    
    
    
    


}