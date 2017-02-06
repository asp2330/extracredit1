package email;

public class SendEmail
{
    public static void main(String[] args)
    {

        Student[] roster = StudentRoster.studentArray();
        String[] assignments = StudentQuestions.questionArray();
        int chapter = StudentQuestions.currentChapter();
        int array[] = StudentQuestions.RNGNoDupe();
        String mailSmtpHost = "localhost";


        for (int i=0; i < roster.length; i++)
        {
            String mailTo = roster[i].getEmail();
            String mailFrom = "Professor@gmail.com";
            String mailSubject = "This Week's Assignment";
            String mailText = "Here is your problem this week: "+ "Chapter "+ chapter+ " " + assignments[array[i]];

            SendEmailMethod.sendEmail(mailTo, mailFrom, mailSubject, mailText, mailSmtpHost);
        }

    }


}
