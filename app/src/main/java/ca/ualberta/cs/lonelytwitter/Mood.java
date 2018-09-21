package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by chase on 2018-09-21.
 */

public abstract class Mood {
    private Date date;

    // Empty constructor
    public Mood() {
        this.date = new Date();
    }

    // Constructor with Date argument
    public Mood(Date date) {
        this.date = date;
    }

    // Get,set date
    public Date getDate() { return this.date; }
    public void setDate(Date date) {this.date = date;}

    // Abstract function for the string of a mood
    abstract String moodString();


}
