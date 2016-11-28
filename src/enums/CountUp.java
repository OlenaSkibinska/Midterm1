package enums;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum CountUp {
        TEN, TWENTY, FIFTY, HUNDRET;
        public String toString() {

            switch (this) {
                case TEN:
                    return "TEN";
                case TWENTY:
                    return "TWENTY";
                case FIFTY:
                    return "FIFTY";
                case HUNDRET:
                    return "HUNDRET";
                default:
                    return  "no ups";

            }
        }
}
