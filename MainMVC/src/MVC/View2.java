/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author KennyBoiii
 */
public class View2 extends GridPane{

	
	private Label feddback = new Label("FeedBack");
	private TextField nameTF = new TextField();
	
	

	public View2() {
                this.addRow(0, feddback );
		this.setAlignment(Pos.CENTER);addRow(1, nameTF);
                nameTF.setScaleX(50);
                feddback.setFont(Font.font("Time New Roman", FontWeight.BOLD,30));
              
        }

    /**
     * @return the View2
     */
    public Label getFeddback() {
        return feddback;
    }

    /**
     * @param feddback the View2 to set
     */
    public void setFeddback(Label feddback) {
        this.feddback = feddback;
    }

    /**
     * @return the nameTF
     */
    public TextField getNameTF() {
        return nameTF;
    }

    /**
     * @param nameTF the nameTF to set
     */
    public void setNameTF(TextField nameTF) {
        this.nameTF = nameTF;
    }
}
