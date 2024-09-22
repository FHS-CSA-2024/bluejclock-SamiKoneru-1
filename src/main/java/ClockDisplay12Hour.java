package src.main.java;


public class ClockDisplay12Hour
{
    //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes
    //Implement a private String for the display
    
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private NumberDisplay dayNight;
    private String display;
    
    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    
    public ClockDisplay12Hour() {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        dayNight = new NumberDisplay(2);
        updateDisplay();
    }
    
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    
    public ClockDisplay12Hour(int newHour, int newMin, int newSec, String AMPM) {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        dayNight = new NumberDisplay(2);
        setTime(newHour, newMin, newSec, AMPM);
    }
    
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    
    public void timeTick() {
        seconds.increment();
        if (seconds.getValue() == 0) {
            minutes.increment();
        }
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        if (hours.getValue() == 0) {
            hours.increment();
        }
        if (hours.getValue() == 12) {
            dayNight.increment();
        }
        updateDisplay();
    }
    
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    
    public void setTime(int newHours, int newMins, int newSecs, String AMPM) {
        hours.setValue(newHours);
        minutes.setValue(newMins);
        seconds.setValue(newSecs);
        if (AMPM.equals("AM")) {
            dayNight.setValue(0);
        }
        else {
            dayNight.setValue(1);
        }
        updateDisplay();
    }
    
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time

    public String getTime() {
        return display;
    }
    
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
    
    public void updateDisplay() {
        String newDisplay = "";
        newDisplay += hours.getDisplayValue();
        newDisplay += ":";
        newDisplay += minutes.getDisplayValue();
        newDisplay += ":";
        newDisplay += seconds.getDisplayValue();
        if (dayNight.getValue() == 0) {
            newDisplay += " AM";
        }
        else {
            newDisplay += " PM";
        }
        display = newDisplay;
    }
}
