package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,520);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Gestion de Pharmacie");
			primaryStage.getIcons().add(new Image("C:\\Users\\amine\\Desktop\\Doc_Java_Fx\\logo.png"));
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Oups un problème");
		}
	}
	
	public static void main(String[] args) {

		launch(args);
	}
}
