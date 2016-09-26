
/**
 * Write a description of class Days here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Days
{
    // instance variables - replace the example below with your own
    private int su,mo,tu,we,th,fr,sa;
    private String dayName;
    private int dayAfterElap;

    /**
     * Constructor for objects of class Days
     */
    public Days()
    {
        // initialise instance variables
        su = 0;
        mo = 1;
        tu = 2;
        we = 3;
        th = 4;
        fr = 5;
        sa = 6;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getDayName(int day)
    {
        if (day == su) {
            dayName = "Sunday";
        } else if (day == mo) {
            dayName = "Monday";       
        } else if (day == tu) {
            dayName = "Tuesday";
        } else if (day == we) {
            dayName = "Wednesday";
        } else if (day == th) {
            dayName = "Thursday";
        } else if (day == fr) {
            dayName = "Friday";
        } else if (day == sa) {
            dayName = "Sunday";
        }
        return dayName;
    }
    
    public String getElapsedDay(int dayElap) {
       // dayAfterElap = \
      return "nothing";
    }
}
