package Level1_09_02_26;
import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) {
        String inputFile = "C:/Users/khush/IdeaProjects/CoreJavaTraining/src/Level1_09_02_26/employees.csv";
        String outputFile = "C:/Users/khush/IdeaProjects/CoreJavaTraining/src/Level1_09_02_26/employees_updated.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String header = br.readLine();
            if (header != null) {
                bw.write(header + "\n");
            }

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(cvsSplitBy);
                if (employee[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(employee[3]);
                    salary *= 1.10; // Increase by 10%
                    employee[3] = String.format("%.2f", salary);
                }
                bw.write(String.join(",", employee) + "\n");
            }
            System.out.println("Salaries updated successfully. New file saved as: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
