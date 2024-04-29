import java.io.InputStream;
import java.net.URL;

public class Example4 {
    public static void main(String[] args) {
    try{
        String location = "http://www.google.com";
        URL url = new URL(location);
        InputStream inputStream = url.openStream();
        byte[] bytes = inputStream.readAllBytes();
        for(byte data : bytes){
            System.out.print(Character.toString(data));
        }

    }catch(Exception e){
        System.out.println("Error" +e.getMessage());
        e.printStackTrace();
    }
    }
}
