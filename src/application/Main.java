package application;
	


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
public class Main extends Application {
	
String display;
	@Override
	public void start(Stage primaryStage)throws Exception {
		
	// creates grid and grid padding	 
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
	
	// creates border and applies border to the scene	
		BorderPane border = new BorderPane();
		Scene scene = new Scene(border,300,300);
		
	// creates text field to display entered number and number after calculation	
		TextField text = new TextField();
		
		
		
	// sets text field and grid onto border	
		border.setTop(text);
		border.setCenter(grid);
		
		
	// creates number buttons	
		Button zero = new Button("0");
		Button one = new Button("1");
		Button two = new Button("2");
		Button three = new Button("3");
		Button four = new Button("4");
		Button five = new Button("5");
		Button six = new Button("6");
		Button seven = new Button("7");
		Button eight = new Button("8");
		Button nine = new Button("9");
	
	// creates operator buttons	
		Button equal = new Button("=");
		Button add = new Button("+");
		Button subtract = new Button("-");
		Button multiply = new Button("*");
		Button divide = new Button("/");
		
		
		
		
	// sets bounds of buttons on grids	
		GridPane.setConstraints(one, 5, 0);
		GridPane.setConstraints(two, 7, 0);
		GridPane.setConstraints(three, 9, 0);
		GridPane.setConstraints(four, 5, 2);
		GridPane.setConstraints(five, 7, 2);
		GridPane.setConstraints(six, 9, 2);
		GridPane.setConstraints(seven, 5, 4);
		GridPane.setConstraints(eight, 7, 4);
		GridPane.setConstraints(nine, 9, 4);
		GridPane.setConstraints(zero, 5, 6);
		GridPane.setConstraints(equal,9, 6);
		GridPane.setConstraints(add, 11, 0);
		GridPane.setConstraints(subtract, 11, 2);
		GridPane.setConstraints(multiply, 11, 4);
		GridPane.setConstraints(divide, 11, 6);
	
	// applies buttons to grid	
		grid.getChildren().addAll(one,two,three,four,five,six,seven,eight,nine,zero,equal,add,subtract,multiply,divide);
		
		
	// sets scene onto stage	
		primaryStage.setScene(scene);
		
	// displays stage	
		primaryStage.show();
		
		
		
		
		
		
	// displays number and operator buttons symbol in text field using event handlers	
		one.setOnAction(new EventHandler<ActionEvent>() 
			{
				@Override
				public void handle(ActionEvent e)
				{
					text.appendText("1");
				}
			});
		two.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText("2");
			}
		});
		three.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText("3");
			}
		});
		four.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText("4");
			}
		});
		five.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText("5");
			}
		});
		six.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText("6");
			}
		});
		seven.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText("7");
			}
		});
		eight.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText("8");
			}
		});
		nine.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText("9");
			}
		});
		zero.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText("0");
			}
		});
		
		
		add.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText(" + ");
				add.setDisable(true);
				subtract.setDisable(true);
				multiply.setDisable(true);
				divide.setDisable(true);
			}
		});
		subtract.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText(" - ");
				add.setDisable(true);
				subtract.setDisable(true);
				multiply.setDisable(true);
				divide.setDisable(true);
			}
		});
		multiply.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText(" * ");
				add.setDisable(true);
				subtract.setDisable(true);
				multiply.setDisable(true);
				divide.setDisable(true);
			}
		});
		divide.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				text.appendText(" / ");
				add.setDisable(true);
				subtract.setDisable(true);
				multiply.setDisable(true);
				divide.setDisable(true);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/* uses math function when button is clicked to perform the calculation and display
		it to the text field
	*/
		equal.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent e)
			{
				String string = text.getText();
				text.setText(math(string));
				add.setDisable(false);
				subtract.setDisable(false);
				multiply.setDisable(false);
				divide.setDisable(false);
				
			}
		});
		
		
		
		
		
		
		
	}
	
/* splits string from text field into String array and then iterates through the array
 	to determine the numbers and functions being performed. It then parses the strings 
 	into integers and performs the calculation. Then converts the number back into string
 	and returns that value.	
*/
	public static String math (String string)
	{
		String[] splitString = string.split(" ");
		int num = 0;
		
			for (int x = 0; x < splitString.length; x++)
			{
				if (splitString[x].equals("+"))
				{
					num = num + (Integer.parseInt(splitString[x-1])+Integer.parseInt(splitString[x+1]));
				}
				if (splitString[x].equals("-"))
				{
					num = num + (Integer.parseInt(splitString[x-1])-Integer.parseInt(splitString[x+1]));
				}
				if (splitString[x].equals("*"))
				{
					num = num + (Integer.parseInt(splitString[x-1])*Integer.parseInt(splitString[x+1]));
				}
				if (splitString[x].equals("/"))
				{
					num = num + (Integer.parseInt(splitString[x-1])/Integer.parseInt(splitString[x+1]));
				}
			}
		
		return Integer.toString(num);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
