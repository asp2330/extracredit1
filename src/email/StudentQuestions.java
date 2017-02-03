package email;

import java.util.Scanner;

public class StudentQuestions {

    public static String[] questionArray() {

        String[] theQuestions = new String[5];
        theQuestions[0] = "Question One";
        theQuestions[1] = "Question Two";
        theQuestions[2] = "Question Three";
        theQuestions[3] = "Question Four";
        theQuestions[4] = "Question Five";

        return theQuestions;
    }

    public static int currentChapter() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter this weeks chapter number:");
        int chapter = input.nextInt();

        return chapter;

    }
}
