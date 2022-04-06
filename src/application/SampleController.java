package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	
	
	@FXML
	private Button btn;
	
	@FXML
	private TextField nomProduit;
	
	@FXML
	private TextField prixProduit;
	
	@FXML
	private TextField qteProduit;
	
	
	@FXML
	private void handleButtonAction(ActionEvent e)
	{
		if(e.getSource() == btn)
		{
			System.out.println("Nom du produit = "+ nomProduit.getText());
			System.out.println("Prix du produit = "+ prixProduit.getText());
			System.out.println("Quantité du produit = "+ qteProduit.getText());
		}
	}
}
