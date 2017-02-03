package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Created by ceciliaxiang on 2017-01-20.
 */

public class Excited extends Mood {
    /**
     * Instantiates a new Excited.
     */
    public Excited(){
        super("Excited");
    }

    /**
     * Instantiates a new Excited.
     *
     * @param date the date
     */
    public Excited(Date date){
        super(date, "Excited");
    }
    public String returnString(){
        return "Feeling Excited";  //return a string
    }
}
