import java.io.*;
import java.nio.charset.StandardCharsets;
import static java.lang.System.in;
public class Main {
    public static void main(String[] args){
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader("C:\\Users\\RajeswariMallina\\sample.text"));
           String line = read.readLine();

            while (line != null){
                line = read.readLine();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            File file=new File("");

            FileWriter writer= new FileWriter(file);
            writer.write("Hi my name is Raji Mallina");
            writer.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}


