import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Characteres {

    public static void main(String[] args) {

        String cadena ="Creativity is thinking-up new things. Innovation is doing new things! Keep*The*Calm & don't Worry :)";
        Pattern pat = Pattern.compile("[^A-Za-z]|[A-Za-z]+");
        Matcher mat = pat.matcher(cadena);

        final String[] result = {""};


        if (mat.find()) {
            result[0] = result[0] +transformar(mat.group());

            mat.results().forEach(( match)->
                   result[0] = result[0] +transformar(match.group())

            );

        }


        String joined  =Arrays.stream(result).collect(Collectors.joining());

        System.out.println(joined);

    }

    public static String transformar (String aux){

        Pattern pat = Pattern.compile("[A-Za-z]+");
        Matcher mat = pat.matcher(aux);
        if (mat.find() && aux.length()>=2){

            String first= aux.substring(0,1);
            String last= aux.substring(aux.length()-1);
            String cadena= aux.substring(1,aux.length()-1);
            long distinct = cadena.chars().distinct().count();
            return first+ distinct+last;

        }

          return aux;
    }

}
