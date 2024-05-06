package jason;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Logger;

import static jason.Gender.MALE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
//jar-download.com

public class JasonSerializerTest {
    @Test
    public void testSerialize() {
       Person person = new Person();
       person.setName("Jason");
       LocalDate dateOfBirth = LocalDate.of(2020, 10,10);
       person.setDateOfBirth(dateOfBirth);
       person.setGender(MALE);
       person.setPhoneNumber("08064556912");

       String json = JsonSerializer.serialize(person);
       String expected = "{\"name\":\"Jason\",\"phoneNumber\":\"08064556912\",\"gender\":\"MALE\",\"Jason\":[2020,10,10]}";
        assertEquals(expected, json);
    }
    @Test
    public void testDeserialize() throws JsonProcessingException {
        Person person = new Person("John", LocalDate.now(), "08164556912", MALE);
        String  json = JsonSerializer.serialize(person);
        Person personFromJeson = JsonSerializer.deserialize(json);
        System.out.println("personFrom Json: " + personFromJeson);

        assertNotNull(personFromJeson);
        assertEquals(person.getDateOfBirth(), personFromJeson.getDateOfBirth());
        assertEquals(MALE, personFromJeson.getGender());
        assertEquals("John", personFromJeson.getName());
        assertEquals("08164556912", personFromJeson.getPhoneNumber());
    }



}
