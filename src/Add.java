

public class Add {

    public  void add(int ... v) {

        String res =v[0]+"";
        int total=v[0];
        for (int i = 1; i < v.length; i++){
            res=res+"+"+v[i];
            total=total+v[i];

        }

        System.out.println(res+"="+total);
    }
}
