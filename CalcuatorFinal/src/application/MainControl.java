package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainControl {
	

	 @FXML private Pane titlePane;
	@FXML private ImageView bclose, bminimize;
	@FXML private Label results;
	private String operator = "";
	private boolean start;
	@FXML private Text output;


	private long num1 = 0;



	private double x;
	private double y;
	
	
	
	public void initialize(Stage s) {
		
		titlePane.setOnMousePressed(mouseEvent->{
		x = mouseEvent.getSceneX();
		y = mouseEvent.getSceneY();
		
		});
		titlePane.setOnMouseDragged(mouseEvent->{
			s.setX(mouseEvent.getScreenX()-x);
			s.setY(mouseEvent.getScreenY()-y);
			
		});
		bclose.setOnMouseClicked(mouseEvent ->{
			s.close();
		});
		
		bminimize.setOnMouseClicked(mouseEvent ->{
			s.setIconified(true);
		});

	
}	@FXML
	public void Numbers(ActionEvent event) {
			
		if(start) {
			results.setText("");
			start=false;
		}
		String value = ((Button)event.getSource()).getText();
		results.setText(results.getText() + value);
	
	}

	@FXML
	public void processOperators(ActionEvent event) {
		
		String value = ((Button)event.getSource()).getText();
		
		if(!value.equals("=")) 
		{
			if(!operator.isEmpty())
				return;
			if(value.equals("C"))
				results.setText("");
			
			operator = value;
			num1 = Long.parseLong(results.getText());
			results.setText("");
		}
		else 
		{
			if(operator.isEmpty()) 
				return;
				
			long num2 = Long.parseLong(results.getText());
			float call = Operators(num1,num2,operator);
			results.setText(String.valueOf(call));
			operator =" ";
			start = true;
		}
	}

	public float Operators(long num1, long num2, String operator) {
		
		switch(operator) 
		{
		case"+":
			return num1 + num2;
		case"-":
			return num1-num2;
		case"x":
			return num1 * num2;
		case"/":
			if (num2==0)
				return 0;
			return num1 / num2;
		case"C":
			return 0;
		default:
			return 0;
		
		
	}
	
	
	}
	}

