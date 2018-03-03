/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.ArrayList;

/**
 *
 * @author KennyBoiii
 */
public class Model {
    ArrayList<MVC> ticketDB = new ArrayList<>();
	MVC currentTicket = new MVC();
	
	public void setCurrentTicket(MVC currentTicket)
	{
		this.currentTicket = currentTicket;
		ticketDB.add(currentTicket);	
	}
	
	public MVC getCurrentTicket()
	{
		return currentTicket;
	}
	
	public ArrayList<MVC> getCurrentTickets()
	{
		return ticketDB;
	}
    
}
