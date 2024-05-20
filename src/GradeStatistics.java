import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {

        System.out.println("Grade Statistics");
        System.out.println(" ");

        //Declare user input and variables
        Scanner inputScanner = new Scanner(System.in);
        double[] allGrades = new double[10];

        //create for loop to store grades for 10 students
        for (int i = 0; i < allGrades.length; i++) {
            System.out.print("Grade for student " + (i + 1) + ": "); //Asks for user input
            allGrades[i] = inputScanner.nextDouble();
        }

        /* Calculate the average, max, and min */

        double maxScore = allGrades[0];
        double minScore = allGrades[0];
        double sumGrades = 0;
        int numGrades = allGrades.length;

        for (double grade : allGrades) {
            sumGrades += grade;
        }
        for (int i = 0; i < allGrades.length; i++) {
            if (i == 0) {
                maxScore = allGrades[i];
            } else if (allGrades[i] > maxScore) {
                maxScore = allGrades[i];
            }
        }
        for (int i = 0; i < allGrades.length; i++) {
            if (i == 0) {
                minScore = allGrades[i];
            } else if (allGrades[i] < minScore) {
                minScore = allGrades[i];
            }
        }
            double average = sumGrades / numGrades;

            // Print the average, max, and min

            System.out.println("Average: " + average);
            System.out.println("Max: " + maxScore);
            System.out.println("Min: " + minScore);
        }
    }


