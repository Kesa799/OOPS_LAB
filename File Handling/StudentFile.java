import java.io.*;
import java.util.Scanner;

public class StudentFile {
    public static void main(String[] args) {
        try {
            // Create file
            File file = new File("student.txt");
            file.createNewFile();

            // Write student details
            FileWriter fw = new FileWriter(file);
            fw.write("Name: Arun\n");
            fw.write("Age: 20\n");
            fw.write("Course: Computer Science\n");
            fw.close();

            // Read and display data
            Scanner sc = new Scanner(file);

            System.out.println("Student Details from File:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (IOException e) {
            System.out.println("Error handling file!");
        }
    }
}