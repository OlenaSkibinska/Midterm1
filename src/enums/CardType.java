package enums;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum CardType {
    WEEKENDDAY, WEEKENDUP, WEEKDAY, WEEKUP, SEASON;
    public String toString() {

        switch (this) {
            case WEEKENDDAY:
                return "WEEKENDDAY";
            case WEEKENDUP:
                return "WEEKENDUP";
            case WEEKDAY:
                return "WEEKDAY";
            case WEEKUP:
                return "WEEKUP";
            case SEASON:
                return "SEASON";
            default:
                return  "no types";

        }
    }

}
