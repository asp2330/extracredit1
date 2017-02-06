package email;

public class Student {
    String email;

    public Student() {
        email = "YouDidNotEnterEmail";
    }

    public Student(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}


