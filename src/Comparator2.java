import java.util.*;
import java.util.Comparator;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Comparator2
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

       Collections.sort(studentList, new Comparator<Student>() {
           @Override
           public int compare(Student e1, Student e2) {

               double r= Double.compare(e2.getCgpa(),e1.getCgpa());

               if(r!=0) return (int)r;

              int  res=e1.getFname().compareTo(e2.getFname());

               if(res!=0) return res;

               res= Integer.compare(e1.getId(),e2.getId());

               return res;
           }
       });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



