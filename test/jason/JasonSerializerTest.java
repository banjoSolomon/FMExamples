package jason;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.logging.Logger;

import static jason.Gender.MALE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JasonSerializerTest {
    @Test
    public void testSerialize() {
       Person person = new Person();
       person.setName("Jason");
       String setDateOfBirth = "2024-03-03";
        person.setDateOfBirth(setDateOfBirth);
       person.setGender(MALE);
       person.setPhoneNumber("08064556912");

       String json = JsonSerializer.serialize(person);
       String expected = "{\"name\":\"Jason\",\"dateOfBirth\":\"2024-03-03\",\"phoneNumber\":\"08064556912\",\"gender\":\"MALE\"}";
        assertEquals(expected, json);
    }
    @Test
    public void testDeserialize() {
        Person person = new Person("John", "2024-02-10", "1999", MALE);
        String  json = "{\"name\":\"Jason\",\"dateOfBirth\":\"2024-03-03\",\"phoneNumber\":\"08064556912\",\"gender\":\"MALE\"}";
        Person personFromJeson = JsonSerializer.deserialize(json);
        assertNotNull(personFromJeson);
        assertEquals(person.getDateOfBirth(), personFromJeson.getDateOfBirth());
        assertEquals(MALE, personFromJeson.getGender());
        assertEquals("John", personFromJeson.getName());
        assertEquals("08064556912", personFromJeson.getPhoneNumber());
    }



}
