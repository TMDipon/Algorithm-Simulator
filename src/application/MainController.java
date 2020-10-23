package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private Label mlbl1;
	@FXML
	private Circle mc1;
	@FXML
	private Circle mc2;
	@FXML
	private Circle mc3;
	@FXML
	private Circle mc4;
	@FXML
	private Circle mc5;
	@FXML
	private Circle mc6;
	
	
	public void InsertionSort(ActionEvent e) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("/application/Insersort.fxml"));
		Stage primaryStage=new Stage();
		Scene scene = new Scene(root,1400,700);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void BinarySearch(ActionEvent e) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("/application/Binser.fxml"));
		Stage stg=new Stage();
		Scene scene = new Scene(root,1400,700);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stg.setScene(scene);
		stg.show();
	}
	
	public void Exit(ActionEvent e)
	{
		System.exit(0);
	}

}
