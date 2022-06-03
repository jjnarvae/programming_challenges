
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class HoraMilitar {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

     public static void main(String[] args) throws IOException  {
        // Write your code here

        String s="12:45:54PM";
        int hora= Integer.parseInt(s.split(":")[0]);
        int min=Integer.parseInt(s.split(":")[1]);;
        int seg=Integer.parseInt(s.split(":")[2].substring(0,2));

        String medir=s.split(":")[2].substring(2,4);

        if(medir.equals("PM")){
            hora=hora>12?12+Integer.parseInt(s.split(":")[0]):hora;
        }else{
            if(hora==12){
                hora=00;
            }
        }

        String resultado= String.format("%02d:%02d:%02d",hora,min,seg);
        System.out.println(resultado);

    }



}

