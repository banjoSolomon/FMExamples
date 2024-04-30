import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example7 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample1.txt";
        try (FileWriter fileWriter = new FileWriter(fileLocation)) {
            fileWriter.write("Hello World!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

}
