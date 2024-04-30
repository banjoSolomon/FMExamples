import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Example0 {
    public static void main(String[] args) {
        try(InputStreamReader inputStreamReader = new InputStreamReader(in);
           BufferedReader reader = new BufferedReader(inputStreamReader)){
            System.out.println("Enter Your data: ");
            String data = reader.readLine();
            System.out.println("You entered :" + data);

        }catch(IOException exception){
            System.err.println("Error:" + exception.getMessage());
        }
    }

}

