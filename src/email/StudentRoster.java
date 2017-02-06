package email;

public class StudentRoster
{
    public static Student[] studentArray()
    {
        final int ROSTER_NUMBER = 5;
        Student[] list = new Student[ROSTER_NUMBER];

        Student student1 = new Student("GeorgeWashington@gmail.com");
        list[0]= student1;

        Student student2 = new Student("JohnAdams@gmail.com");
        list[1]= student2;

        Student student3 = new Student("ThomasJefferson@gmail.com");
        list[2]= student3;

        Student student4 = new Student("JamesMadison@gmail.com");
        list[3]= student4;

        Student student5 = new Student("DonaldTrump@gmail.com");
        list[4]= student5;

        return list;
    }

}
