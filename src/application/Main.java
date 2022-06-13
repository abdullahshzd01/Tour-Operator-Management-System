package application;
	
import BL.TourAgency;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	public static TourAgency TA;
	
	@Override
	public void start(Stage primaryStage) {
		
		TA = new TourAgency();
		
		if(TA == null) {
			
			System.out.println("TA IS NULL");
			
		}
		else {
			
			System.out.println("TA IS NOT NULL");
			
		}
		
		try {
			
			Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("FrontPage.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(true);
			primaryStage.show();
		} catch(Exception e) {
			
			e.printStackTrace(); 
		} 
		
		
	}  
	
	

	public static void main(String[] args) {
		launch(args); 
		
	}
}