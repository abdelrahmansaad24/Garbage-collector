import java.util.ArrayList;
import java.util.Iterator;

public class MarkCompact {
    public static ArrayList<object> compact(ArrayList<object> objects_used){
        int start = 0, end = -1;
        Iterator<object> it = objects_used.listIterator();
        while (it.hasNext()){
            object x = it.next();
            int size = x.getSize();
            start = end + 1;
            end = start + size - 1;
            x.setStart_memory(start);
            x.setEnd_memory(end);
        }
        return objects_used;
    }
}
