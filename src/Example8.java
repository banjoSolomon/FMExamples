import java.io.*;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        String fileLocation ="C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample1.txt";
        try(FileInputStream fileInputStream= new FileInputStream(fileLocation);
           InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader)){
               System.out.println(reader.lines().collect(Collectors.joining("\n")));
        }catch(IOException exception){
            exception.printStackTrace();
            System.err.println("Error:" + exception.getMessage());
        }
    }

}


