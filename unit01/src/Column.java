/**
 * Created by Vladimir Shabanov on 01/04/16.
 */
public class Column {

    private int multiplicand;

    public Column(int multiplicand) {
        this.multiplicand = multiplicand;
    }

    public void show() {
        String prefix = "";
        String sufix = "";
        for (int i = 1; i <= 10; i++) {
            prefix = getPrefix(i);
            sufix = getSufix(i);
            System.out.println(prefix + i + " = " + sufix);
        }
    }

    private String getSufix(int i) {
        String sufix;
        if (multiplicand * i < 10) {
            sufix = " " + Integer.toString(multiplicand * i);
        } else {
            sufix = Integer.toString(multiplicand * i);
        }
        return sufix;
    }

    private String getPrefix(int i) {
        String prefix = "";
        if (i < 10) {
            prefix = Integer.toString(multiplicand) + " x  ";
        } else {
            prefix = Integer.toString(multiplicand) + " x ";
        }
        return prefix;
    }
}
