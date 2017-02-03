package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Created by ceciliaxiang on 2017-01-20.
 */

public class Bored extends Mood {
    /**
     * Instantiates a new Bored.
     */
    public Bored(){
        super("Bored");
    }

    /**
     * Instantiates a new Bored.
     *
     * @param date the date
     */
    public Bored(Date date){
        super(date, "Bored");
    }
    public String returnString(){
        return "Feeling Bored";
    }
}
