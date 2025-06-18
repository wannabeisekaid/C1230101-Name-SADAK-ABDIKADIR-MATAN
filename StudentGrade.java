import java.util.*;
public class StudentGrade {
    private static String ST1, ST2, ST3;
    private static double GD1, GD2, GD3;
    private static int COUNTING = 0;
    private static double ADDING = 0;
    private static double HighestGradeSoFar = -1;
    private static double LowestGradeSoFar = 101;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int USERCHOICE;

        do {
            System.out.println("      Student management system");
            System.out.println("1. Add student");
            System.out.println("2. Show Report");
            System.out.println("3. Search student");
            System.out.println("4. Exit:");
            System.out.println("Input:");
            USERCHOICE = input.nextInt();

            if      (USERCHOICE == 1)
                AddStudent(input);

            else if (USERCHOICE == 2)
                ReportingOverall();

            else if (USERCHOICE == 3)
                StudentSearch(input);

        } while (USERCHOICE != 4);
    }

    private static void AddStudent(Scanner in) {
        if (COUNTING >= 3) {
            System.out.println("program is full, no more students can be added.");
            return;
        }

        System.out.print("first name: ");
        String name = in.next();
        System.out.print("total grade: ");
        double GD = in.nextDouble();
        COUNTING++;
        ADDING = ADDING + GD;
        if (GD > HighestGradeSoFar)
            HighestGradeSoFar = GD;

        if (GD < LowestGradeSoFar)
            LowestGradeSoFar = GD;


        if      (COUNTING == 1) {
            ST1 = name; GD1 = GD; }

        else if (COUNTING == 2) {
            ST2 = name; GD2 = GD; }

        else {
            ST3 = name; GD3 = GD; }
        System.out.println("we added student: " + name);
    }

    private static void ReportingOverall() {
        if (COUNTING == 0) {
            System.out.println("there are no students.");
            return;
        }
        double avg = Math.round((ADDING / COUNTING) * 100) / 100.0;
        System.out.println("The number of Student: " + COUNTING);
        System.out.println("Their average : " + avg);
        System.out.println("The highest grade : " + HighestGradeSoFar);
        System.out.println("the lowest grade  : " + LowestGradeSoFar);
    }
    private static void StudentSearch(Scanner in) {
        if (COUNTING == 0) {
            System.out.println("No students to search for.");
            return;
        }

        System.out.print("Student's first name: ");
        String target = in.next();
        if      (target.equalsIgnoreCase(ST1))
            System.out.println("Student's grade: "+ GD1);

        else if (target.equalsIgnoreCase(ST2))
            System.out.println("Student's grade: "+ GD2);

        else if (target.equalsIgnoreCase(ST3))
            System.out.println("Student's grade: "+ GD3);

        else
            System.out.println("This student is not in here!.");
    }
}
