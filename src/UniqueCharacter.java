public class UniqueCharacter {

    public static void main(String[] args) {

        String s= "hackthegame";

        System.out.println(firstUniqChar(s));

    }

    public static int firstUniqChar(String s){

        //vector 26
        int freq [] = new int[26];

        for(int i = 0; i < s.length(); i ++){
            freq [s.charAt(i) - 'a'] ++;
        }


        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i+1;
        return -1;
    }
}
