package email;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class StudentQuestions {

    public static String[] questionArray() {

        final int QUESTION_NUMBER = 5;

        String[] theQuestions = new String[QUESTION_NUMBER];
        theQuestions[0] = "Example Question One";
        theQuestions[1] = "Example Question Two";
        theQuestions[2] = "Example Question Three";
        theQuestions[3] = "Example Question Four";
        theQuestions[4] = "Example Question Five";

        return theQuestions;
    }

    public static int currentChapter() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter this weeks chapter number:");
        int chapter = input.nextInt();

        return chapter;

    }
    public static int getQuestionArraySize(){
        String[] array = StudentQuestions.questionArray();
        int length = array.length;
        return length;
    }

    public static int[] RNGNoDupe(){
        int size =  getQuestionArraySize();
        int[] array = new int[size];
        int x = 0;

        ArrayList<Integer> list = new ArrayList<Integer>(size);
            for (int i = 1; i <= size; i++) {
            list.add(i);}

        Random rand = new Random();

        while (list.size() > 0) {
        int index = rand.nextInt(list.size());
        array[x] = list.remove(index)-1;
        x++;
    }
        return array;
    }

}



