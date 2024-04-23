import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    //TODO: java.io and java.nio
    public static void main(String[] args) {
        try{
        //step 1
        String location = "C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample2.txt";
        Path path = Paths.get(location);
        //step 2
        Files.createFile(path);
    }catch(IOException exception){
            exception.printStackTrace();
        }

        try {
            String location = "C:\\Users\\DELL\\IdeaProjects\\OOP\\src\\sample.txt";
            Path path = Paths.get(location);
            Files.deleteIfExists(path);
        }catch(IOException exception){
            exception.printStackTrace();
        }
   }
}
