/**
 * Created by Vladimir Shabanov on 01/04/16.
 */
public class Column {

    public void show() {
        String prefix = "";
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                prefix = "2 x  ";
            } else {
                prefix = "2 x ";
            }

            System.out.println(prefix + i + " = " + 2 * i);
        }
    }
}
