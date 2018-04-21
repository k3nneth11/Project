/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author KennyBoiii
 */
public class Model {
        private static final String user = "root";
        private static final String pass = "hello";
        private static final String con_string = "jdbc:mysql://localhost:3306/citation";
    
        ArrayList<MVC> ticketDB = new ArrayList<>();
	MVC currentTicket = new MVC();
      
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    
    
	
	public void setCurrentTicket(MVC currentTicket)
	{
		this.currentTicket = currentTicket;
		Database();	
	}
	
	public MVC getCurrentTicket()
	{
		return currentTicket;
	}
	
	public ArrayList<MVC> getCurrentTickets()
	{
		return ticketDB;
	}
        
         public ArrayList<MVC> getTicketDB() {
        return ticketDB;
    }
         public void Database(){
        try {
            con = DriverManager.getConnection(con_string,user,pass);
            System.out.println("Connected!");
            
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM citation.citationinfo;");
            
            String licenseNo = currentTicket.getLicensenum();
            String state = currentTicket.getState();
            
            String model = currentTicket.getModel();
            String color = currentTicket.getColor();
            String citationnum = currentTicket.getCitationnum();
            String date = currentTicket.getDate();
            String time = currentTicket.getTime();
            String location = currentTicket.getLocation();

            String insert = "INSERT INTO citation.citationinfo" + " (License_Number, state, permit_Number, vehicle_Model, Color, Violation, Date, Time, Location, IssuedBy)" + " VALUES ('"+licenseNo+"','"+state+"','"+"','"+"','"+color+"','"+"','"+date+"','"+time+"','"+location+"')";
            
            while(rs.next()){
                String licensenumDB = rs.getString("license_number");
                String dateViolationDB = rs.getString("date_violation");
                String timeDB = rs.getString("time_violation");
                String stateDB = rs.getString("state");
                String colorDB = rs.getString("color_vehicle");
                String locationDB = rs.getString("location");
            //    String permitNoDB = rs.getString("permit_Number");
            //    String vehicleDB = rs.getString("Vehicle_Model");
            //    String dateDB = rs.getString("Date");
            //    String issuedByDB = rs.getString("IssuedBy");
                
                currentTicket = new MVC(licensenumDB, stateDB,colorDB, dateViolationDB, timeDB, locationDB);
                
                ticketDB.add(currentTicket);
                
                        
            }
            
            
            stmt.executeUpdate(insert);   
           
            
        
        }
         catch (SQLException e) {
            System.err.println(e);
        }
    
}
          public void setTicketDB(ArrayList<MVC> ticketDB) {
        this.ticketDB = ticketDB;
    }
    
}
