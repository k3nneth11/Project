/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmvc;

import MVC.Controller;
import MVC.Model;
import MVC.View;
import MVC.View2;
import MVC.View3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author KennyBoiii
 */
public class MainMVC extends Application {
    private TextArea TA = new TextArea();
    
   @Override
	public void start(Stage primaryStage) {
                BorderPane border = new BorderPane();
                
		
		View view = new View();
                View2 view2 = new View2();
                View3 view3 = new View3();
                border.setCenter(view);
                border.setBottom(view2);
                border.setRight(view3);
                border.setLeft(getTA());
		Model model = new Model();
               
                
		Controller mc = new Controller(model,view);
		
		Scene scene = new Scene(border, 1600, 1500);
		
		primaryStage.setTitle("Ticket Citation!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

    /**
     * @return the TA
     */
    public TextArea getTA() {
        return TA;
    }

    /**
     * @param TA the TA to set
     */
    public void setTA(TextArea TA) {
        this.TA = TA;
    }
	
}
