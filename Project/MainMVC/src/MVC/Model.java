/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author KennyBoiii
 */
public class Model {
    ArrayList<MVC> ticketDB = new ArrayList<>();
	MVC currentTicket = new MVC();
        DataOutputStream out;
        
        public Model()  {
		try {
	out = new DataOutputStream(new BufferedOutputStream(
              new FileOutputStream("TicketCitation.txt")));
			
		} catch (Exception e) {
		}
		
	}
        
        public void storeTicketObject(MVC currentTicket)
	{
		try {
		out.writeChars(currentTicket.getLicensenum());
		out.writeChars(currentTicket.getModel());
		out.writeChars(currentTicket.getColor());
		out.writeChars(currentTicket.getLocation());	
 		out.writeChars(currentTicket.getState());
		out.writeChars(currentTicket.getTime());
		out.writeChars(currentTicket.getCitationnum());
		
               
		out.writeChars("\r\n");	
		out.close();
		} catch (Exception e) {
		}

		
	}
	
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
