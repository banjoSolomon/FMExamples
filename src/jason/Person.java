package jason;

public class Person {
    private String name;
    private String dateOfBirth;
    private String phoneNumber;
    private Gender gender;

    public  Person(){}

    public String toString(){
        return "person->{name: " + name + ", dateOfBirth: " + dateOfBirth + ", gender: " + gender + "phoneNumber: " + phoneNumber + "}";
    }

    public Person(String name, String dateOfBirth, String phoneNumber, Gender gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
