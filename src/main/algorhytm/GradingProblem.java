import java.util.ArrayList;
import java.util.List;

public class GradingProblem {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(38);
        grades.add(72);
        grades.add(17);
        grades.add(59);

        System.out.println(ResultGP.gradingStudents(grades));
    }
}

class ResultGP {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int x;

        for (int i = 0; i < grades.size(); i++) {
            x = grades.get(i);
            if (x>=38){
                if (grades.get(i)%5>2) {
                 x += (5-(x%5));
                 grades.set(i,x);
                }
            }
        }

        return grades;
    }
}
