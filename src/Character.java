
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Character {

    public static void main(String[] args) {

        String cadena=".fgf.";

        Pattern pat = Pattern.compile("[^a-zA-Z0-9_]");
        Matcher mat = pat.matcher(cadena);
        if (mat.find()) {




        } else {
            System.out.println("No Válido");
        }

    }
}
