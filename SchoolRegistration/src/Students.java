import java.time.LocalDate;

public class Students {
    private String firstname;
    private String lastname;
    private String birthday;
    private String course;
    private String email;
    public Students(String firstname, String lastname, String birthday, String course, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.course = course;
        this.email = email;
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    public String generateStudentNum(String birthday, String lastname){
        char lastnameInitial = lastname.charAt(0);
        String studentNum;

        int year = LocalDate. now(). getYear();
        String day = birthday.substring(7).replaceAll("/", "");

        studentNum = year + "-" + day + "01-" + lastnameInitial;
        return studentNum;
    }

}
