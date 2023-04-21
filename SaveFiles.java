package HomeWorkTasks.OOP.Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public interface SaveFiles {
    default void savefile(String string) throws IOException {
        File file = new File("file.txt");
        try
        {
            boolean created = file.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        FileWriter fw = new FileWriter("file.txt");
        fw.write(string);
        fw.close();
    }
}
