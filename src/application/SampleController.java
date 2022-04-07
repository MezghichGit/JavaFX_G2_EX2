package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SampleController {
	
	//ArrayList<Produit> produits = new ArrayList<>();
	
	
	@FXML
	private Button btnAdd;
	
	@FXML
	private Button btnList;
	
	@FXML
	private TextField nomProduit;
	
	@FXML
	private TextField prixProduit;
	
	@FXML
	private TextField qteProduit;
	
	@FXML
	private ToggleGroup ab;
	
	@FXML
	private RadioButton france;
	
	@FXML
	private RadioButton autre;
	
	
	@FXML
	private DatePicker dateFabrication;
	
	@FXML
	private TextArea remarques;
	
	@FXML
	private void handleButtonAjoutAction(ActionEvent e)
	{
		

			RadioButton temp = (RadioButton) ab.getSelectedToggle();

			double prix = Double.parseDouble(prixProduit.getText());
			int qte = Integer.parseInt(qteProduit.getText());
			
			Produit p = new Produit(nomProduit.getText(),prix,qte,temp.getText(),dateFabrication.getValue().toString(),remarques.getText());
			
			Main.list.add(p);
			
			/// début partie alert
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Ajout de produit");
			alert.setHeaderText(null);
			alert.setContentText("Félicitation, produit ajouté avec succès");

			alert.showAndWait();
			/// fin partie alert
			
			nomProduit.clear();
			prixProduit.clear();
			qteProduit.clear();
			dateFabrication.setValue(null);
			ab.selectToggle(france);
			remarques.clear();
		
		
	}
	
	
	@FXML
	private void handleButtonListAction(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnAdd.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListProduits.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,700,400);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);

		
	}
	
	@FXML
	private void handleMenuListAction(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) btnAdd.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("ListProduits.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,700,400);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
		
	}
}
