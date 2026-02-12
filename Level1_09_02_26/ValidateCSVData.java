package Level1_09_02_26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final String PHONE_REGEX = "^\\d{10}$";

    public static void main(String[] args) {
        String csvFile = "C:/Users/khush/IdeaProjects/CoreJavaTraining/src/Level1_09_02_26/validation_test.csv";
        String line;
        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            System.out.println("Validating CSV Data...");
            int rowNum = 1;
            while ((line = br.readLine()) != null) {
                rowNum++;
                String[] data = line.split(",");
                String email = data[2];
                String phone = data[3];

                boolean isEmailValid = emailPattern.matcher(email).matches();
                boolean isPhoneValid = phonePattern.matcher(phone).matches();

                if (!isEmailValid || !isPhoneValid) {
                    System.out.print("Row " + rowNum + " is invalid: ");
                    if (!isEmailValid)
                        System.out.print("[Invalid Email: " + email + "] ");
                    if (!isPhoneValid)
                        System.out.print("[Invalid Phone: " + phone + "] ");
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
