package jason;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JasonExampleTest {


    @Test
    public void testTransactionTakesDateAndReturnAllTransactionsForThatDay() throws IOException {
        List<Transaction> expected = JasonExample.dailyTransaction(LocalDate.of(2024, 5, 1));
        assertEquals(4, expected.size());
    }

    @Test
    public void testTransactionTakesAStartDateEndDateAndReturnsAllTransactionsForThatDay() throws IOException {
        List<Transaction> expected = JasonExample.dateTransaction(LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 7));
        assertEquals(2, expected.size());

    }
    @Test
    public void testToGetTheAverageTransactionAmountForSpecifiedPeriod() throws IOException {
        double expected = JasonExample.averageTransaction(LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 7));
       assertEquals(5000.0, expected, 0.0);

    }

    @Test
    public void testToGetAccountNumberAndAccountSummery() throws IOException {
        AccountSummery accountSummery = JasonExample.getAccountSummary("12345678", LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 7));
        assertEquals("12345678", accountSummery.getAccountNumber());

        double expectedBalance = 10000.0;
        assertEquals(expectedBalance, accountSummery.getBalance(), 0.001);
        String expectedSummary = "Account Number: 12345678\nBalance: " + expectedBalance;
        assertEquals(expectedSummary, accountSummery.getAccountSummary());
    }



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
        int numberOfDigit = 8;
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

