
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class GridChallengue {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        int n= grid.get(0).length();
        char [][] matriz= new char[grid.size()][n];

        for(int i=0;i<grid.size();i++){
            char[] aux=grid.get(i).toCharArray();
            Arrays.sort(aux);
            String s= new String(aux);
            grid.set(i,s);
            for (int k=0;k<n;k++) {
                matriz[i][k]=s.charAt(k);;
            }

        }


        for(int i=0;i<grid.size()-1;i++){
            for(int j=0;j<n;j++){
                if(matriz[i][j]>matriz[i+1][j])
                    return "NO";
            }
        }
        return "YES";
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> grid = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String gridItem = bufferedReader.readLine();
                grid.add(gridItem);
            }

            String result = GridChallengue.gridChallenge(grid);
            System.out.print(result);
          //  bufferedWriter.write(result);
           // bufferedWriter.newLine();
        }

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}

