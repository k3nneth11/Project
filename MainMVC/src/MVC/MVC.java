/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author KennyBoiii
 */
public class MVC {

   
        private String licensenum;
	private String model;
        private String date;
        private String time;
        private String state;
        private String color;
        private String location;
        private String citationnum;
        
        public MVC(){
}
        
 public MVC(String licensenum, String model, String date, String time, String state, String color, String location, String citationnum) {
        this.licensenum = licensenum;
        this.model = model;
        this.date = date;
        this.time = time;
        this.state = state;
        this.color = color;
        this.location = location;
        this.citationnum = citationnum;
    }
    /**
     * @return the licensenum
     */
    public String getLicensenum() {
        return licensenum;
    }

    /**
     * @param licensenum the licensenum to set
     */
    public void setLicensenum(String licensenum) {
        this.licensenum = licensenum;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the citationnum
     */
    public String getCitationnum() {
        return citationnum;
    }

    /**
     * @param citationnum the citationnum to set
     */
    public void setCitationnum(String citationnum) {
        this.citationnum = citationnum;
    }
        
    
}
