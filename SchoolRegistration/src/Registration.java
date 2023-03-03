import java.util.Scanner;
public class Registration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validations valid = new Validations();

        String firstname;
        String lastname;
        String birthday;
        String course;
        String email;

        //for user-input and validation of first name
        do {
            System.out.print("First Name: ");
            firstname = scan.nextLine();

            if(valid.inputValidate(firstname)){
                break;
            } else {
                System.out.println("Invalid Input! Please Try Again.");
            }
        } while(!valid.inputValidate(firstname));

        //for user-input and validation of last name
        do {
            System.out.print("Last Name: ");
            lastname = scan.nextLine();

            if(valid.inputValidate(lastname)){
                break;
            } else {
                System.out.println("Invalid Input! Please Try Again.");
            }
        } while (!valid.inputValidate(lastname));

        //for user-input and validation of birthday
        boolean isValid = false;
        do {
            System.out.print("Birthday (yyyy/mm/dd): ");
            birthday = scan.nextLine();

            isValid = valid.dobValidate(birthday);

            if(!isValid) {
                System.out.println("Please Try Again.");
            }
        } while (!isValid);

        //for user-input and validation of course
        do {
            System.out.print("Course: ");
            course = scan.nextLine();

            if(valid.inputValidate(course)){
                break;
            } else {
                System.out.println("Invalid Input! Please Try Again.");
            }
        } while (!valid.inputValidate(course));

        //for user-input and validation of email
        do {
            System.out.print("Email Address: ");
            email = scan.nextLine();

            if(valid.emailValidate(email)){
                break;
            } else {
                System.out.println("Invalid Email Input! Please Try Again.");
            }
        } while (!valid.emailValidate(email));

        System.out.println("Registration Success!");
        System.out.println("----------------------------------------------------");

        //Print All Details
        Students student = new Students(firstname, lastname, birthday, course, email);

        System.out.println("Name: " + student.getFirstname() + " " + student.getLastname());
        System.out.println("Birthday: " + student.getBirthday());
        System.out.println("Course: "+ student.getCourse());
        System.out.println("Email Address: " + student.getEmail());
        System.out.println("Student Number: " + student.generateStudentNum(birthday, lastname));

        System.out.println("----------------------------------------------------");



    }
}
