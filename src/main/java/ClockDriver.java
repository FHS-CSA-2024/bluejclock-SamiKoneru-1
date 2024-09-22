package src.main.java;


public class ClockDriver
{
    public static void tickTest(int myHours, int myMins) {
        ClockDisplay tickTest1 = new ClockDisplay(myHours,myMins);
        String tickTest1Output = tickTest1.getTime();
        System.out.println("\nTickTest1 Before Increment - " + tickTest1Output);
        tickTest1.timeTick();
        tickTest1Output = tickTest1.getTime();
        System.out.println("TickTest1 After Increment - " + tickTest1Output);
    }
    
    public static void secsTickTest(int myHours, int myMins, int mySecs) {
        ClockDisplaySeconds tickSecs1 = new ClockDisplaySeconds(myHours, myMins, mySecs);
        String tickSecs1Output = tickSecs1.getTime();
        System.out.println("\nTickTest1 Before Increment - " + tickSecs1Output);
        tickSecs1.timeTick();
        tickSecs1Output = tickSecs1.getTime();
        System.out.println("TickTest1 After Increment - " + tickSecs1Output);
    }
    
    public static void hourTickTest(int myHours, int myMins, int mySecs, String AMPM) {
        ClockDisplay12Hour tickHour1 = new ClockDisplay12Hour(myHours, myMins, mySecs, AMPM);
        String tickHour1Output = tickHour1.getTime();
        System.out.println("\nTickTest1 Before Increment - " + tickHour1Output);
        tickHour1.timeTick();
        tickHour1Output = tickHour1.getTime();
        System.out.println("TickTest1 After Increment - " + tickHour1Output);
    }
    
    public static void main(String[] args) {
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        System.out.println("Testing ClockDisplay");
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty Con. Test " + test1Output);
        ClockDisplay test2 = new ClockDisplay(3,33);
        String test2Output = test2.getTime();
        System.out.println("2 Arg Con. Test - " + test2Output);
        
        test2.setTime(4,02);
        String test3Output = test2.getTime();
        System.out.println("Set Time Test  - " + test3Output);
        
        tickTest(3,32);
        tickTest(3,9);
        tickTest(1,59);
        tickTest(9,59);
        tickTest(23,59);
        
        
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        System.out.println("\nTesting ClockDisplaySeconds");
        ClockDisplaySeconds secs1 = new ClockDisplaySeconds();
        String secs1Output = secs1.getTime();
        System.out.println("Empty Con. Test " + secs1Output);
        ClockDisplaySeconds secs2 = new ClockDisplaySeconds(3,32,59);
        String secs2Output = secs2.getTime();
        System.out.println("2 Arg Con. Test - " + secs2Output);
        
        secs2.setTime(4,02,01);
        String secs3Output = secs2.getTime();
        System.out.println("Set Time Test  - " + secs3Output);
        
        secsTickTest(3,32,59);
        secsTickTest(1,0,59);
        secsTickTest(1,59,59);
        secsTickTest(23,59,59);
        
        
        
       
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        System.out.println("\nTesting ClockDisplay12Hour");
        ClockDisplay12Hour hour1 = new ClockDisplay12Hour();
        String hour1Output = hour1.getTime();
        System.out.println("Empty Con. Test " + hour1Output);
        ClockDisplay12Hour hour2 = new ClockDisplay12Hour(3,32,59, "AM");
        String hour2Output = hour2.getTime();
        System.out.println("2 Arg Con. Test - " + hour2Output);
        
        hour2.setTime(4,02,01,"PM");
        String hour3Output = hour2.getTime();
        System.out.println("Set Time Test  - " + hour3Output);
        
        hourTickTest(3,32,59,"PM");
        hourTickTest(11,59,59,"PM");
        hourTickTest(11,59,59,"AM");
        hourTickTest(12,59,59,"PM");
        
    }
}
