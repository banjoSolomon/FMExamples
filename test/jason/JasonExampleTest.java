package jason;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class JasonExampleTest {

   @Test
    public void calculateTotalTransactions() throws IOException {
        String input = "C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\jason\\Transaction.json";
        int transactionTotal = 11000;
        assertEquals(transactionTotal, JasonExample.calculateTotalTransaction(input));

    }
    @Test
    public void testToCheckNumberOfDigit(){
       String input = "\"C:\\Users\\DELL\\Documents\\solo\\Welcome10.java\"";
       int numberOfDigit = 2;
       assertEquals(numberOfDigit, JasonExample.toCheckNumberOfDigit(input));
    }

    @Test
    public void testToCountNumberOfSentences(){
        String input = "C:\\Users\\DELL\\Documents\\solo\\Welcome10.java";
        int numberOfSentences = 3;
        assertEquals(numberOfSentences, JasonExample.toCountNumberOfSentences(input));
    }
}
