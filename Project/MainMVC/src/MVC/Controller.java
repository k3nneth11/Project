/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import MVC.View;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author KennyBoiii
 */
public class Controller {
        Model model;
	View view;
  
        

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
               
		attachHandlers();
	}
	public void attachHandlers()
	{
		// attach handlers for GUI
		view.getSubmitBtn().setOnAction(
			new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent event) 
			{
				
			String lnum= view.getLicensenumTF().getText();
			String make= view.getModelTF().getText();
			String date= view.getDateTF().getText();
			String time= view.getTimeTF().getText();
                        String state= view.getStateTF().getText();
			String color= view.getColorTF().getText();
			String location= view.getLocationTF().getText();
			String citationnum= view.getCitationnumTF().getText();
			MVC currentTicket = new MVC(lnum,make,date,time,state,color,location,citationnum);
			
			model.setCurrentTicket(currentTicket);
			view.clearFields();
				
			}
				
			}

		);
		
		view.getViewBtn().setOnAction(
			new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent event) 
			{
			 //set the fields
			MVC currentTicket = model.getCurrentTicket();
			
			view.updateTicketView(currentTicket);
				
			}
				
			}

		);
                
                view.getStoreBtn().setOnAction(
			new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent event) 
			{
			 //set the fields
			MVC currentTicket = model.getCurrentTicket();
			
			model.storeTicketObject(currentTicket);
				
			}
				
			}

		);
		view.getViewAllBtn().setOnAction(
			new EventHandler<ActionEvent>()
			{
			@Override
			public void handle(ActionEvent event) 
			{
			 //set the fields
		ArrayList<MVC> currentTicket = model.getCurrentTickets();
			
		view.updateTicketViewAll(currentTicket);
				
			}
				
			}

		);		
		
		
		
		
	}
    
}
