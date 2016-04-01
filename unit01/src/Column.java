/**
 * Created by Vladimir Shabanov on 01/04/16.
 */
public class Column {

    public void show() {
        String prefix = "";
        String sufix = "";
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                prefix = "2 x  ";
            } else {
                prefix = "2 x ";
            }

            if (2 * i < 10) {
                sufix = " " + Integer.toString(2 * i);
            } else {
                sufix = Integer.toString(2 * i);
            }

            System.out.println(prefix + i + " = " + sufix);
        }
    }
}
