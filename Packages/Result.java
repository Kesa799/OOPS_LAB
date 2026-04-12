package result;

import student.Student;

public class Result {

    public double calculateAverage(Student s) {
        return (s.getMarks1() + s.getMarks2() + s.getMarks3()) / 3.0;
    }

    public String calculateGrade(Student s) {
        double avg = calculateAverage(s);

        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 50)
            return "C";
        else
            return "Fail";
    }

    public void displayResult(Student s) {
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Average: " + calculateAverage(s));
        System.out.println("Grade: " + calculateGrade(s));
    }
}