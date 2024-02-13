package aish;
import java.util.Scanner;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);

		        System.out.print("Enter the number of subjects: ");
		        int numSubjects = in.nextInt();

		        int[] marks = new int[numSubjects];

		        for (int i = 0; i < numSubjects; i++) {
		            System.out.print("Enter marks (out of 100) for Subject " + (i + 1) + ": ");
		            marks[i] = in.nextInt();
		        }

		        in.close();

		        int totalMarks = calculateTotalMarks(marks);
		        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
		        char grade = calculateGrade(averagePercentage);

		        System.out.println("\nResults:");
		        System.out.println("Total Marks: " + totalMarks);
		        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
		        System.out.println("Grade: " + grade);
		    }

		    private static int calculateTotalMarks(int[] marks) {
		        int total = 0;
		        for (int mark : marks) {
		            total += mark;
		        }
		        return total;
		    }

		    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
		        return (double) totalMarks / numSubjects;
		    }

		    private static char calculateGrade(double averagePercentage) {
		        if (averagePercentage >= 90 && averagePercentage <= 100) {
		            return 'A';
		        } else if (averagePercentage >= 80) {
		            return 'B';
		        } else if (averagePercentage >= 70) {
		            return 'C';
		            
		        } else if (averagePercentage >= 60) {
		            return 'D';
		        } else {
		            return 'F';
		        }
		    }

	}

