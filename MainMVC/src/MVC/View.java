/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author KennyBoiii
 */
public class View extends GridPane {
        
        private Label     licensenumLabel  = new Label("Enter License Number: ");
	private TextField licensenumTF = new TextField();
	
	private Label     modelLabel  = new Label("Enter Model/Make of Vehicle: ");
	private TextField modelTF = new TextField();
	
	private Label     dateLabel  = new Label("Enter Date of Violation: ");
	private TextField dateTF = new TextField();
	
	private Label     timeLabel  = new Label("Enter Time of Violation: ");
	private TextField timeTF = new TextField();
        
        private Label     stateLabel  = new Label("Enter State: ");
	private TextField stateTF = new TextField();
        
        private Label     colorLabel  = new Label("Enter Color of Vehicle: ");
	private TextField colorTF = new TextField();
        
        private Label     locationLabel  = new Label("Enter the Location of Violation: ");
	private TextField locationTF = new TextField();
	
        private Label     citationnumLabel  = new Label("Enter Citation Number: ");
	private TextField citationnumTF = new TextField();
        
	private Label     textArealLabel  = new Label("Show All Tickets: ");
	private TextArea AllTicketsTA = new TextArea();

	private Button submitBtn = new Button("Submit Data");
	private Button viewBtn = new Button("View data");
	private Button viewAllBtn = new Button("View all data");
        private Button storeBtn = new Button("Store Ticket");
       
	public View()
	{
		this.addRow(0, licensenumLabel, licensenumTF);
		this.addRow(1, modelLabel, modelTF);
		this.addRow(2, dateLabel, dateTF);
		this.addRow(3, timeLabel, timeTF);
                this.addRow(4, stateLabel, stateTF);
                this.addRow(5, colorLabel, colorTF);
                this.addRow(6, locationLabel, locationTF);
                this.addRow(7, citationnumLabel, citationnumTF);
		this.addRow(8, submitBtn);
                this.addRow(9, storeBtn);
		this.addRow(10, viewBtn);
		this.addRow(11, viewAllBtn);
                
                this.setAlignment(Pos.CENTER);
                
                
                
	}
        
        
                
            
        
	
	public void updateTicketView(MVC currentUser)
	{
		String lnum        = currentUser.getLicensenum();
		String model       = currentUser.getModel();
		String date        = currentUser.getDate();
		String time        = currentUser.getTime();
                String state       = currentUser.getState();
                String color       = currentUser.getColor();
                String location    = currentUser.getLocation();
                String citationnum = currentUser.getCitationnum();
                
		
		this.getChildren().clear();
		this.addRow(0, licensenumLabel, licensenumTF);
		licensenumTF.setText(lnum);
		
		this.addRow(1, modelLabel, modelTF);
		modelTF.setText(model);
		
		this.addRow(2, dateLabel, dateTF);
		dateTF.setText(date);
		
		this.addRow(3, timeLabel, timeTF);
		timeTF.setText(time);
                
                this.addRow(4, stateLabel, stateTF);
		stateTF.setText(state);
                
                this.addRow(5, colorLabel, colorTF);
		colorTF.setText(color);
                
                this.addRow(6, locationLabel, locationTF);
		locationTF.setText(location);
                
                this.addRow(7, citationnumLabel, citationnumTF);
		citationnumTF.setText(citationnum);
		
		this.addRow(8, getSubmitBtn());
		this.addRow(9, getViewBtn());
	}
	
	public void updateTicketViewAll(ArrayList<MVC> allTickets)
	{
		String lnum  ="";
		String model="";
		String date    ="";
		String time = "";
                String state = "";
                String color = "";
                String location = "";
                String citationnum = "";
		String alltickets="";
		for (int i = 0; i < allTickets.size(); i++)
		{
			 MVC current =(MVC) allTickets.get(i);
			 lnum   =current.getLicensenum();
			 model    =current.getModel();
			 date    =current.getDate();
			 time = current.getTime();
                         state = current.getState();
                         color = current.getColor();
                         location = current.getLocation();
                         citationnum = current.getCitationnum();
			alltickets +=lnum+" "+model+" "+date+" "+time+" "+state+" "+color+" "+location+" "+citationnum+"\n";
		}
		
		this.getChildren().clear();
		this.addRow(0, licensenumLabel, licensenumTF);
                
		this.addRow(1, modelLabel, modelTF);
                
		this.addRow(2, dateLabel, dateTF);
                
		this.addRow(3, timeLabel, timeTF);
                
                this.addRow(4, stateLabel, stateTF);
                
                this.addRow(5, colorLabel, colorTF);
                
                this.addRow(6, locationLabel, locationTF);
                
                this.addRow(7, citationnumLabel, citationnumTF);
                
                
		
		
		this.addRow(8, getSubmitBtn());
		this.addRow(9, getViewBtn());
		this.addRow(10, getViewAllBtn());
		getAllTicketsTA().setText(alltickets);
		this.addRow(11, getAllTicketsTA());
		
	}
	
	public void clearFields()
	{
		licensenumTF.clear();
		modelTF.clear();
		dateTF.clear();
		timeTF.clear();
                stateTF.clear();
		colorTF.clear();
		locationTF.clear();
		citationnumTF.clear();
	}

    /**
     * @return the licensenumLabel
     */
    public Label getLicensenumLabel() {
        return licensenumLabel;
    }

    /**
     * @param licensenumLabel the licensenumLabel to set
     */
    public void setLicensenumLabel(Label licensenumLabel) {
        this.licensenumLabel = licensenumLabel;
    }

    /**
     * @return the licensenumTF
     */
    public TextField getLicensenumTF() {
        return licensenumTF;
    }

    /**
     * @param licensenumTF the licensenumTF to set
     */
    public void setLicensenumTF(TextField licensenumTF) {
        this.licensenumTF = licensenumTF;
    }

    /**
     * @return the modelLabel
     */
    public Label getModelLabel() {
        return modelLabel;
    }

    /**
     * @param modelLabel the modelLabel to set
     */
    public void setModelLabel(Label modelLabel) {
        this.modelLabel = modelLabel;
    }

    /**
     * @return the modelTF
     */
    public TextField getModelTF() {
        return modelTF;
    }

    /**
     * @param modelTF the modelTF to set
     */
    public void setModelTF(TextField modelTF) {
        this.modelTF = modelTF;
    }

    /**
     * @return the dateLabel
     */
    public Label getDateLabel() {
        return dateLabel;
    }

    /**
     * @param dateLabel the dateLabel to set
     */
    public void setDateLabel(Label dateLabel) {
        this.dateLabel = dateLabel;
    }

    /**
     * @return the dateTF
     */
    public TextField getDateTF() {
        return dateTF;
    }

    /**
     * @param dateTF the dateTF to set
     */
    public void setDateTF(TextField dateTF) {
        this.dateTF = dateTF;
    }

    /**
     * @return the timeLabel
     */
    public Label getTimeLabel() {
        return timeLabel;
    }

    /**
     * @param timeLabel the timeLabel to set
     */
    public void setTimeLabel(Label timeLabel) {
        this.timeLabel = timeLabel;
    }

    /**
     * @return the timeTF
     */
    public TextField getTimeTF() {
        return timeTF;
    }

    /**
     * @param timeTF the timeTF to set
     */
    public void setTimeTF(TextField timeTF) {
        this.timeTF = timeTF;
    }

    /**
     * @return the stateLabel
     */
    public Label getStateLabel() {
        return stateLabel;
    }

    /**
     * @param stateLabel the stateLabel to set
     */
    public void setStateLabel(Label stateLabel) {
        this.stateLabel = stateLabel;
    }

    /**
     * @return the stateTF
     */
    public TextField getStateTF() {
        return stateTF;
    }

    /**
     * @param stateTF the stateTF to set
     */
    public void setStateTF(TextField stateTF) {
        this.stateTF = stateTF;
    }

    /**
     * @return the colorLabel
     */
    public Label getColorLabel() {
        return colorLabel;
    }

    /**
     * @param colorLabel the colorLabel to set
     */
    public void setColorLabel(Label colorLabel) {
        this.colorLabel = colorLabel;
    }

    /**
     * @return the colorTF
     */
    public TextField getColorTF() {
        return colorTF;
    }

    /**
     * @param colorTF the colorTF to set
     */
    public void setColorTF(TextField colorTF) {
        this.colorTF = colorTF;
    }

    /**
     * @return the locationLabel
     */
    public Label getLocationLabel() {
        return locationLabel;
    }

    /**
     * @param locationLabel the locationLabel to set
     */
    public void setLocationLabel(Label locationLabel) {
        this.locationLabel = locationLabel;
    }

    /**
     * @return the locationTF
     */
    public TextField getLocationTF() {
        return locationTF;
    }

    /**
     * @param locationTF the locationTF to set
     */
    public void setLocationTF(TextField locationTF) {
        this.locationTF = locationTF;
    }

    /**
     * @return the citationnumLabel
     */
    public Label getCitationnumLabel() {
        return citationnumLabel;
    }

    /**
     * @param citationnumLabel the citationnumLabel to set
     */
    public void setCitationnumLabel(Label citationnumLabel) {
        this.citationnumLabel = citationnumLabel;
    }

    /**
     * @return the citationnumTF
     */
    public TextField getCitationnumTF() {
        return citationnumTF;
    }

    /**
     * @param citationnumTF the citationnumTF to set
     */
    public void setCitationnumTF(TextField citationnumTF) {
        this.citationnumTF = citationnumTF;
    }

    /**
     * @return the textArealLabel
     */
    public Label getTextArealLabel() {
        return textArealLabel;
    }

    /**
     * @param textArealLabel the textArealLabel to set
     */
    public void setTextArealLabel(Label textArealLabel) {
        this.textArealLabel = textArealLabel;
    }

    /**
     * @return the AllUsersTA
     */
    
    /**
     * @return the submitBtn
     */
    public Button getSubmitBtn() {
        return submitBtn;
    }

    /**
     * @param submitBtn the submitBtn to set
     */
    public void setSubmitBtn(Button submitBtn) {
        this.submitBtn = submitBtn;
    }

    /**
     * @return the viewBtn
     */
    public Button getViewBtn() {
        return viewBtn;
    }

    /**
     * @param viewBtn the viewBtn to set
     */
    public void setViewBtn(Button viewBtn) {
        this.viewBtn = viewBtn;
    }

    /**
     * @return the viewAllBtn
     */
    public Button getViewAllBtn() {
        return viewAllBtn;
    }

    /**
     * @param viewAllBtn the viewAllBtn to set
     */
    public void setViewAllBtn(Button viewAllBtn) {
        this.viewAllBtn = viewAllBtn;
    }

    /**
     * @return the AllTicketsTA
     */
    public TextArea getAllTicketsTA() {
        return AllTicketsTA;
    }

    /**
     * @param AllTicketsTA the AllTicketsTA to set
     */
    public void setAllTicketsTA(TextArea AllTicketsTA) {
        this.AllTicketsTA = AllTicketsTA;
    }

    /**
     * @return the storeBtn
     */
    public Button getStoreBtn() {
        return storeBtn;
    }

    /**
     * @param storeBtn the storeBtn to set
     */
    public void setStoreBtn(Button storeBtn) {
        this.storeBtn = storeBtn;
    }
    
}
