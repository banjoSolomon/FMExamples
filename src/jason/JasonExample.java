package jason;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JasonExample {
    public static int calculateTotalTransaction(String jsonFilePath) throws IOException {
        Path path = Paths.get(jsonFilePath);
        String fileContent = Files.readString(path);
        Transaction[] transactions = deserializes(fileContent);
        int total = 0;
        for (Transaction transaction : transactions) {
            total += transaction.getAmount();
        }
        return total;

    }

    public static Transaction[] deserializes(String jason) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jason, Transaction[].class);
    }
}


