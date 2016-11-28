import cards.Card;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class Control {
    private int size = 10;

    private int index = 0;
    private Card[] my = new Card[size];

    public void addCards(Card nw) {
        checkSize();
        my[index] = nw;
        index++;
    }

    public void checkSize() {
        if (index == size - 1) {
            size *= 2;
            Card[] b = new Card[size];
            for (int i = 0; i <= index; i++) {
                b[i] = my[i];
            }
            my = b;
        }
    }


    public String toString() {
        String s = "";
        for (int i = 0; i < index; i++) {
            s += my[i].toString() + "\n";
        }
        return s;
    }

}
