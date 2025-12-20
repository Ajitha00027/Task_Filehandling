import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {
    public static void main(String[] args)
    {
        try{
            FileWriter fw = new FileWriter("demo.xls",true);
            fw.write( "\n The data is appended ");
            fw.close();
            System.out.println("data written successfully");
        }
        catch(IOException e){
            e.printStackTrace();

        }
    }
}
