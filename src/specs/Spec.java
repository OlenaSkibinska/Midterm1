package specs;

import enums.CardType;
import enums.CountDay;
import enums.CountUp;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class Spec {
    public CountDay day;
    public CountUp up;
    public CardType type;
    public Spec(CountUp up, CardType type){
        this.up = up;
        this.type = type;
    }

    public Spec(CountDay day, CardType type) {
        this.day = day;
        this.type = type;
    }
    public Spec(CardType type){
        this.type = type;
    }
}
