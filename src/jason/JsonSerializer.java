package jason;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayInputStream;

public class JsonSerializer {
    public static String serialize(Person person) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(person);
            return json;
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static Person deserialize(String json) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(json, Person.class);
    }
}