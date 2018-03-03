/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 *
 * @author KennyBoiii
 */
public class View3 extends VBox {
         
        
        private TextArea text = new TextArea("                              Payments\n"
                + "Payments can be made at the following office:\n"
                + "Business Office, Tandy 107\n"
                + "Monday thru Firday: 8:00 am-5:00 pm\n"
                + "$25 per citation, other fees may apply\n"
                + "$100 for boot removal\n\n  "
                + "Payment can be mailed to the following address:\n\n\n "
                + "             TSC\n\n"
                + "         C/) Finance Enforcement\n\n"
                + "        Attn: Parking Enforcement\n\n"
                + "             80 Fort Brown\n\n"
                + "         Brownsville, TX 78520\n\n\n\n"
                + "         DO NOT MAIL IN CASH!\n\n"
                + "For More Information on parkin citations please visit:"
                + "\n                 www.tsc.edu/parking");
        double height = 1000;
        double width = 300;
    
        public View3(){
            
            text.setPrefHeight(height);
            text.setPrefWidth(width);
            this.setSpacing(5);
            this.getChildren().add(text);
            
        }

   

  

    /**
     * @return the text
     */
    public TextArea getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(TextArea text) {
        this.text = text;
    }
}
