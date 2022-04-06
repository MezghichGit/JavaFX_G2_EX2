package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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
	private ToggleGroup ab;
	
	@FXML
	private DatePicker dateFabrication;
	
	@FXML
	private TextArea remarques;
	
	@FXML
	private void handleButtonAction(ActionEvent e)
	{
		if(e.getSource() == btn)
		{
			System.out.println("Nom du produit = "+ nomProduit.getText());
			System.out.println("Prix du produit = "+ prixProduit.getText());
			System.out.println("Quantité du produit = "+ qteProduit.getText());
			RadioButton temp = (RadioButton) ab.getSelectedToggle();
			System.out.println("Pays de fabrication = " + temp.getText());
			System.out.println("Date de fabrication = " + dateFabrication.getValue());
			System.out.println("Remarques = " + remarques.getText());
		}
	}
}
