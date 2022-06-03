
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Rotacion {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        char[] alfabetOriginal = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String al="abcdefghijklmnopqrstuvwxyz";

        int ro=0;
        if(k>al.length()){
            ro=k-((k/al.length())*al.length());
        }else{
            ro=k;
        }

        System.out.println(ro);

        String agregar=al.substring(0,ro);
        al=al.substring(ro,al.length()).concat(agregar);



        Dictionary<String, String> dic = new Hashtable<String, String>();

        for (int i = 0; i < alfabetOriginal.length; i++) {
            dic.put(String.valueOf(alfabetOriginal[i]), String.valueOf(al.charAt(i)));
        }

        //encontrar equivalencia 159357fwzx

        String r="";
        for (int i = 0; i < s.length(); i++) {
            String aux=dic.get(String.valueOf(s.charAt(i)).toLowerCase())==null?String.valueOf(s.charAt(i)):dic.get(String.valueOf(s.charAt(i)).toLowerCase());

           /* if(Character.isUpperCase(s.charAt(i))){
                aux=aux.toUpperCase();
            }*/
            r=r+aux;
        }
        return r;


    }


    public static void main(String[] args) throws IOException {

       String p=caesarCipher("159357lcfd",98);
       System.out.print(p);

    }

}

