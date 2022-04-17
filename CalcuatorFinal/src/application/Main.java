package application;
	
import java.lang.ModuleLayer.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage c) throws Exception {
 
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("NewCalc.fxml"));
		
			Scene scene = new Scene(loader.load());
			
			
			 
			
			scene.setFill(Color.TRANSPARENT);
			c.initStyle(StageStyle.TRANSPARENT);
			c.setScene(scene);
			c.setResizable(false);
			c.setTitle("Calculator");
			c.getIcons().add(new Image(getClass().getResourceAsStream("/calc.jpeg")));
			((MainControl)loader.getController()).initialize(c);
			c.show();
			
		}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
