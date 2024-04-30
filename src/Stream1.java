import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream1 {
    public static void main(String[] args) {
        String fileLocation ="C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample1.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileLocation)) {
            String data  = "\nInvest Your Money Wisely, Stop playing Sporty Bet";
            fileOutputStream.write(data.getBytes());
        }catch(IOException exception){
            exception.printStackTrace();
            System.err.println("Error:" + exception.getMessage());
        }
    }

}

