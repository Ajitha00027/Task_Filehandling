import java.io.*;
import java.util.*;
public class Filehandling_read {
    public static void main(String[] args)
    {
        try{
          File file = new File("demo.txt");
          Scanner scanner = new Scanner(file);
          while ((scanner.hasNextLine())) {
            System.out.println(scanner.nextLine());
          }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
}
