package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
/**
 * Created by ceciliaxiang on 2017-01-20.
 */

public abstract class Mood {
    private Date date;
    private String mood;


    public Mood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public Mood(Date date, String mood) {
        this.mood = mood;
        this.date = date;
    }

    //geter and setter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    //return a string
    public abstract String returnString();
}





