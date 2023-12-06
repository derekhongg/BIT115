//Derek Hong
//Assignment 3
//12.06.2023
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        intro();

        double ExamScore1 = getExamScores(console, 1);
        double GPAScore1 = computeGPA(console);
        double ExamScore2 = getExamScores(console, 2);
        double GPAScore2 = computeGPA(console);

        double student1 = reportResults(1, ExamScore1, GPAScore1);
        double student2 = reportResults(2, ExamScore2, GPAScore2);

        compareApplicants(student1, student2);

    }

    public static void intro() {

        System.out.println("This program compares two applicants to determine which one seems like the stronger applicant.");
        System.out.println("For each candidate I will need either SAT or ACT scores plus a weighted GPA.");

    }

    public static double getExamScores(Scanner console, int applicantNum) {
        System.out.println("Information for applicant #" + applicantNum + ":");
        System.out.print("  do you have 1) SAT scores or 2) ACT scores? ");
        int option = console.nextInt();
        double score;

        if (option == 1) {
            score = getSATInformation(console);
        } else {
            score = getACTInformation(console);
        }
        System.out.println("    exam score = " + score);
        return score;
    }

    public static double getSATInformation(Scanner console) {
        System.out.print("    SAT math? ");
        double score = console.nextInt() * 2;
        System.out.print("    SAT verbal? ");
        score += console.nextInt();
        return score/24.0;
    }

    public static double getACTInformation(Scanner console) {
        System.out.print("	ACT English? ");
		  double score = console.nextInt();
		  System.out.print("	ACT Math? ");
		  score += console.nextInt() * 2;
		  System.out.print("	ACT Reading? ");
		  score += console.nextInt();
		  System.out.print("	ACT Science? ");
		  score += console.nextInt();
		  return score / 1.8;
    }

    public static double computeGPA(Scanner console) {
        System.out.print("    Overall GPA? ");
        double GPA = console.nextDouble();
        System.out.print("    Max GPA? ");
        double maxGPA = console.nextDouble();
        double GPAScore = (GPA/maxGPA) * 100;
        return GPAScore;
    }

    public static double reportResults (int applicantNo, double ExamScore, double GPAScore) {
        System.out.println("Applicant #" + applicantNo + " overall score: " + (ExamScore + GPAScore));
        return ExamScore + GPAScore;
    }
    
    public static void compareApplicants(double applicant1, double applicant2) {
        if (applicant1 > applicant2) {
            System.out.print("The first applicant seems to be better");
        } else if( applicant2 > applicant1) {
            System.out.print("The second applicant seems to be better");
        } else {
            System.out.print("The two applicants seem to be equal");
        }
    }
}