package cards;

import enums.CardType;
import enums.CountDay;
import enums.CountUp;
import specs.Spec;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class Card {
    protected Spec spec;
    public Card(Spec a) {
        this.spec = a;
    }

    public String toString() {
        return this.getType() + ", "+ this.getDay() + ", " + this.getUp();
    }

    public CountDay getDay(){
        return spec.day;
    }

    public CountUp getUp() {return this.spec.up;}

    public CardType getType(){return this.spec.type;}


}
