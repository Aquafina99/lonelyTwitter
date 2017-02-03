package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Created by ceciliaxiang on 2017-01-20.
 */

public abstract class Mood {
    private Date date;
    private String mood;


    /**
     * Instantiates a new Mood.
     *
     * @param mood the mood
     */
    public Mood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    /**
     * Instantiates a new Mood.
     *
     * @param date the date
     * @param mood the mood
     */
    public Mood(Date date, String mood) {
        this.mood = mood;
        this.date = date;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
//geter and setter
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets mood.
     *
     * @return the mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * Sets mood.
     *
     * @param mood the mood
     */
    public void setMood(String mood) {
        this.mood = mood;
    }

    /**
     * Return string string.
     *
     * @return the string
     */
//return a string
    public abstract String returnString();
}





