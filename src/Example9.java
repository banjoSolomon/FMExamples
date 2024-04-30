import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Example9 {
    public static void main(String[] args) {
        try(OutputStreamWriter writer = new OutputStreamWriter(out);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            bufferedWriter.write("hello world my program");
        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }
}
}
