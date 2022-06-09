import java.util.*;

public class Java1DArray {

    public static boolean canWin(int leap, int[] game) {

        return isSolvable(leap, game, 0);

    }

    public static boolean canWin2(int leap, int [] game){
        int n = game.length;

        Stack<Integer> potentialIndexes = new Stack<>();
        potentialIndexes.push(0);

        while (!potentialIndexes.isEmpty()) {
            int i = potentialIndexes.pop();

            if (i >= n) return true;

            if (i < 0 || game[i] == 1) continue;

            game[i] = 1;

            potentialIndexes.push(i+1);
            potentialIndexes.push(i-1);
            potentialIndexes.push(i+leap);
        }

        return false;
    }
    private static boolean isSolvable(int leap, int[] game, int i) {
        // Base Cases
        if (i >= game.length) {
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }

        game[i] = 1; // marks as visited

        // Recursive Cases
        return isSolvable(leap, game, i + leap) ||
                isSolvable(leap, game, i + 1) ||
                isSolvable(leap, game, i - 1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin2(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}