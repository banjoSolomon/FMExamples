package jason;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class JasonExampleTest {

    @Test
    public void calculateTotalTransactions() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\jason\\Transaction.json";
        int transactionTotal = 11000;
        assertEquals(transactionTotal, JasonExample.calculateTotalTransaction(input));

    }

    @Test
    public void testToCheckNumberOfDigit() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample2.txt";
        String fileContent = new String(Files.readAllBytes(Paths.get(input)));
        int numberOfDigit = 7;
        assertEquals(numberOfDigit, JasonExample.toCheckNumberOfDigit(fileContent));
    }

    @Test
    public void testToCountNumberOfSentences() throws IOException {
        String filePath = "C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample1.txt";
        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
        int numberOfSentences = 5;
        assertEquals(numberOfSentences, JasonExample.toCountNumberOfSentences(fileContent));
    }
    @Test
    public void testToCountNumbersOfZeros() throws IOException {
        String filePath = "C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample3.txt";
        String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
        int numberOfZeros = 10;
        assertEquals(numberOfZeros, JasonExample.toCountNumbersOfZeros(fileContent));
    }

}

