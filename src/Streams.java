import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Streams {
    public static void main(String[] args) {
        String fileLocation ="C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample1.txt";
        try(var inputStream = new FileInputStream(fileLocation);
        var dataInputStream = new DataInputStream(inputStream)){
        byte[] fileData = dataInputStream.readAllBytes();
        System.out.println(new String(fileData));
        }catch(IOException exception){
        exception.printStackTrace();
        System.err.println("Error:" + exception.getMessage());
        }
    }

}
