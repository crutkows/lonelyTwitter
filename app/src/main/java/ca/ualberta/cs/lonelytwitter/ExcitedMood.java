package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by chase on 2018-09-21.
 */

public class ExcitedMood extends Mood {

    // Empty constructor
    public ExcitedMood() {
        super();
    }

    // Constructor with Date argument
    public ExcitedMood(Date date){
        super(date);
    }

    // Implementation of abstract class
    public String moodString(){
        return "OMG, I'm so excited!";
    }
}

