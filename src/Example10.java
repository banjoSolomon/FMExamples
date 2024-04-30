import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example10 {
    public static void main(String[] args)  {
        String location = "C:\\Users\\DELL\\Desktop\\Eexesise";
        Path path = Paths.get(location);
        try{
        BufferedWriter writer = Files.newBufferedWriter(path);
        writer.write("happy Birthday, Solomon");
        writer.flush();
        writer.close();

    }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
