package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ListProduitsController  implements Initializable{

    @FXML
    private TableColumn<Produit, String> date;

    @FXML
    private TableColumn<Produit, String> nom;

    @FXML
    private TableColumn<Produit, String> pays;

    @FXML
    private TableColumn<Produit, Double> prix;

    @FXML
    private TableColumn<Produit, Integer> qte;

    @FXML
    private TableColumn<Produit, String> remarque;

    @FXML
    private TableView<Produit> tblProduits;
    
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		nom.setCellValueFactory(new PropertyValueFactory<Produit, String>("nom"));
		date.setCellValueFactory(new PropertyValueFactory<Produit, String>("date"));
		pays.setCellValueFactory(new PropertyValueFactory<Produit, String>("pays"));
		remarque.setCellValueFactory(new PropertyValueFactory<Produit, String>("remarque"));
		prix.setCellValueFactory(new PropertyValueFactory<Produit, Double>("prix"));
		qte.setCellValueFactory(new PropertyValueFactory<Produit, Integer>("qte"));
		
		//Charger le TableView par Observable List qui contient nos objets Produits
		tblProduits.setItems(Main.list);
		
	}
	
	@FXML
	private void handleMenuAddAction(ActionEvent e) throws IOException
	{
		Stage primaryStage = (Stage) tblProduits.getScene().getWindow();
		BorderPane layoutAddProduct = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		Scene sceneList = new Scene(layoutAddProduct,380,500);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(sceneList);
		
	}
    
    

}