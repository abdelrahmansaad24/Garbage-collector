import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadFromFile {
    public static HashMap<String, object> readHeapPointers(String path1, String path2) throws IOException {
        HashMap<String, object> map = new HashMap<>();
        //reading heap file
        File file = new File(path1);
        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null){
            String[] record = st.split(",");

            //store objects in hashmap
            object obj = new object(Integer.parseInt(record[0]), Integer.parseInt(record[1].trim()), Integer.parseInt(record[2].trim()));

            map.put(record[0], obj);
        }
        //reading pointers file
        File file2 = new File(path2);
        BufferedReader br2 = new BufferedReader(new FileReader(file2));

        while ((st = br2.readLine()) != null){
            String[] record = st.split(",");
            //store children of each object in graph
            map.get(record[0]).add_child(map.get(record[1]));
        }
        return map;
    }

    public static ArrayList<String> ReadRoots(String path) throws IOException {
        String st;
        ArrayList<String> roots = new ArrayList<>();
        //reading roots file
        File file3 = new File(path);

        // Creating an object of BufferedReader class
        BufferedReader br3 = new BufferedReader(new FileReader(file3));
        while ((st = br3.readLine()) != null){
           roots.add(st);
        }

        return roots;
    }
}
