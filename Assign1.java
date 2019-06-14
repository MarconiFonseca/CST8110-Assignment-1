import java.text.DecimalFormat;//program uses decimal format
import java.util.Scanner; //program uses class Scanner 

/**
 -CST8110 Introduction to Computer Programming Author: Marconi Fonseca
 -section:330  
 -lab teacher:Anissa Shaddy 
 -Purpose of program: This program calculates your final grade based on your score 
 -Assignment number: #1
 -Date:2018 - 10 -03 (revised)
 */

public class Assign1 { // declaring the class
	public static void main(String args[]) {

		// Declaring Variables

		double labMark = 0;
		double quiz_Test = 0;
		double assignment = 0;
		double midterm = 0;
		double final_Exam = 0;

		// Obtaining the input
		Scanner input = new Scanner(System.in);

		// Decimal Format
		DecimalFormat format = new DecimalFormat("00.00");

		// Initial msg
		System.out.println("Welcome to the CST8110 Calculator. This program calculates your final grade based on your scores  \n");

		do { // block for input conditions
			System.out.print("1-Enter your Lab mark out of 10: ");
			labMark = input.nextDouble();
			if ((labMark < 0 || labMark > 10))
				System.out.print("ERROR -Enter a valid number from 0 to 10  \n");
		} while (labMark < 0 || labMark > 10);

		do { // block for input conditions
			System.out.print("2-Enter your Quiz/Test mark out of 10: ");
			quiz_Test = input.nextDouble();
			if (quiz_Test < 0 || quiz_Test > 10)
				System.out.print("ERROR -Enter a valid number from 0 to 10  \n");
		} while (quiz_Test < 0 || quiz_Test > 10);

		do { // block for input conditions
			System.out.print("3-Enter your Assignment mark out of 20: ");
			assignment = input.nextDouble();
			if (assignment < 0 || assignment > 20)
				System.out.print("ERROR -Enter a valid number from 0 to 20  \n");
		} while (assignment < 0 || assignment > 20);

		do { // block for input conditions
			System.out.print("4-Enter your Midterm mark out of 20: ");
			midterm = input.nextDouble();
			if (midterm < 0 || midterm > 20)
				System.out.print("ERROR -Enter a valid number from 0 to 20 \n ");
		} while (midterm < 0 || midterm > 20);

		do { // block for input conditions
			System.out.print("5-Enter your Final Exam mark out of 40: ");
			final_Exam = input.nextDouble();
			if (final_Exam < 0 || final_Exam > 40)
				System.out.print("ERROR -Enter a valid number from 0 to 40 \n"  );
		} while (final_Exam < 0 || final_Exam > 40);

		// calculating the grades

		double theory_grade = ((quiz_Test + midterm + final_Exam) / 70) * 100;
		double practical_grade = ((assignment + labMark) / 30) * 100;
		double final_grade = ((quiz_Test + midterm + final_Exam + assignment + labMark) / 100) * 100;

		// output the grades
		System.out.println("\nTheory grade: " + format.format(theory_grade) + "% ");
		System.out.println("Practical grade: " + format.format(practical_grade) + "%");
		System.out.println("Final grade " + format.format(final_grade) + "%");

	} // end of main
}// end of class
