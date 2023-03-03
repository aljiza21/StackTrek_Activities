import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Validations {
    public boolean inputValidate(String input) {
        String valid = "^[a-zA-Z]{1,50}$";
        return input.matches(valid);
    }
    public boolean emailValidate(String email) {
        // Regular expression pattern for email addresses
        String eValidate = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
        return email.matches(eValidate);
    }
    public boolean dobValidate(String birthday) {
        if (birthday == null || birthday.trim().isEmpty()) {
            System.out.println("Birthday cannot be empty.");
            return false;
        }

        String birthday_format = "^\\d{4}/(0[1-9]|1[0-2])/(0[1-9]|[12]\\d|3[01])$";
        boolean result = birthday.matches(birthday_format);

        if (result) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate dob = LocalDate.parse(birthday, formatter);
            LocalDate curDate = LocalDate.now();

            int age = Period.between(dob, curDate).getYears();
            if (age >= 16 && age <= 30) {
                return true;
            } else {
                System.out.println("Birthday is not acceptable range for college age.");
                return false;
            }

        } else {
            System.out.println("Invalid Format Inputted.");
            return false;
        }

    }
}
