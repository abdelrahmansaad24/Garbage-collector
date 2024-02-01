import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainCopy {
    public static void main(String[] args) throws IOException {
        //HashMap to store all objects using key as identifier and value as properties of object
        HashMap<String, object> map;
        //arrayList to store objects in use
        ArrayList<object> usedObjects = new ArrayList<>();
        ArrayList<String> roots;

        //read Heap and pointers files
        map = ReadFromFile.readHeapPointers(args[0], args[2]);
        //read roots file
        roots = ReadFromFile.ReadRoots(args[1]);

        ArrayList<object> ro = new ArrayList<>();
        Iterator<String> i = roots.iterator();
        while (i.hasNext()){
            ro.add(map.get(i.next()));
        }

        usedObjects = Copy.copy(ro);
        WriteToFile.writeDataLineByLine(args[3], usedObjects);    }
}
