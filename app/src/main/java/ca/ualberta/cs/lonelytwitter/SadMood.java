package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by chase on 2018-09-21.
 */

public class SadMood extends Mood{

    // Empty constructor
    public SadMood() {
        super();
    }

    // Constructor with Date argument
    public SadMood(Date date){
        super(date);
    }

    // Implementation of abstract class
    public String moodString(){
        return "I'm just so so sad!";
    }
}
