import student.Student;
import result.Result;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Arun", 85, 90, 78);

        Result r = new Result();
        r.displayResult(s1);
    }
}