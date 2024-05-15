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

    public static int toCheckNumberOfDigit(String input) {
        int count = 0;
        for (int index = 0; index < input.length(); index++) {
            if (Character.isDigit(input.charAt(index))) {
                index++;
            }
        }
        return count;
    }

    public static int toCountNumberOfSentences(String input) {
        int count = 0;
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == '.') {
                count++;
            }
        }
        return count;
    }


    public static int toCountNumbersOfZeros(String fileContent) {
        int count = 0;
        for (int index = 0; index < fileContent.length(); index++) {
            if (fileContent.charAt(index) == '0') {
                count++;
            }
        }
        return count;
    }
}


