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
}
