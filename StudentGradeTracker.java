import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();

            names.add(name);
            grades.add(grade);
        }

        // Calculate average, highest and lowest
        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {
            sum += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = sum / n;

        // Display summary report
        System.out.println("\n===== STUDENT GRADE REPORT =====");

        for (int i = 0; i < n; i++) {
            System.out.println(
                names.get(i) + " : " + grades.get(i)
            );
        }

        System.out.println("-------------------------------");
        System.out.printf("Average Grade : %.2f%n", average);
        System.out.println("Highest Grade : " + highest);
        System.out.println("Lowest Grade  : " + lowest);

        sc.close();
    }
}