package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



	public class ListProductsController implements Initializable{

		@FXML
	    private TableView<Produit> tableProducts;
		
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
	    
	    ObservableList<Produit> list = FXCollections.observableArrayList(
	    		new Produit("Panadol", 4, 20, "France", "10/01/2022", "Très bon pour les douleurs"), 
	    		new Produit("Ferverx", 8, 40, "Autre", "02/04/2022", "Très bon pour la grippe"), 
	    		new Produit("Gripex", 7, 30, "France", "05/02/2022", "Très bon pour la grippe et fièvre")
	    		);
	    

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
			nom.setCellValueFactory(new PropertyValueFactory<Produit, String>("nom"));
			
			
			date.setCellValueFactory(new PropertyValueFactory<Produit, String>("date"));
			pays.setCellValueFactory(new PropertyValueFactory<Produit, String>("pays"));
			remarque.setCellValueFactory(new PropertyValueFactory<Produit, String>("remarque"));
			
			prix.setCellValueFactory(new PropertyValueFactory<Produit, Double>("prix"));
			qte.setCellValueFactory(new PropertyValueFactory<Produit, Integer>("qte"));
			
			//ObservableList<Produit> produits = getProductsList();
			tableProducts.setItems(list);
			
		}


	    
}