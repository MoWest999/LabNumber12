/**
 * Created by Grand Circus Student on 7/25/2017.
 */
public enum Enumeration {
               ROCK, PAPER, SCISSORS;

    //you can add a toString to an enum just like to a Class
        public String toString() {
            switch(this) {
                case ROCK:
                    return "Rock- CRUSH!";
                case PAPER:
                    return "Paper... SMOTHER!";
                default:
                    return "Scissors - SLICE AND DICE" ;
            }
        }
    }


