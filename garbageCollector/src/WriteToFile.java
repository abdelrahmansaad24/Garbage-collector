import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class WriteToFile {
    public static void writeDataLineByLine(String filepath, ArrayList<object> usedObjects)
    {
        // first create file object for file placed at location
        // specified by filepath
        File file = new File(filepath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputFile = new FileWriter(file);

            // create CSVWriter object fileWriter object as parameter
            CSVWriter writer = new CSVWriter(outputFile);
            Iterator<object> it = usedObjects.listIterator();
            while (it.hasNext()){
                object z = it.next();
                String[] obj = {String.valueOf(z.getObject_identifier()),
                        String.valueOf(z.get_startMemory()), String.valueOf(z.get_endMemory())};
                // adding objects to csv
                writer.writeNext(obj);
            }
            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
