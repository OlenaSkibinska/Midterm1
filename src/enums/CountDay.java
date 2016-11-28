package enums;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum CountDay {
    ONE, TWO, FIVE;
    public String toString() {

        switch (this) {
            case ONE:
                return "ONE";
            case TWO:
                return "TWO";
            case FIVE:
                return "FIVE";
            default:
                return  "no days";

        }
    }

}

