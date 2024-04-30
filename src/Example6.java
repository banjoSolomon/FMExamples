import java.io.FileReader;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample1.txt";
        char[] fileChars = new char[1024];
        try (FileReader fileReader = new FileReader(fileLocation)) {
            int numberOfCharactersRead = fileReader.read(fileChars);
            displayFileContent(numberOfCharactersRead, fileChars);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    private static void displayFileContent(int numberOfCharactersRead, char[] fileChars) {
        for (int counter = 0; counter < numberOfCharactersRead; counter++) {
            System.out.print(fileChars[counter]);

        }
    }
}