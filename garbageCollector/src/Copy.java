import java.util.ArrayList;

public class Copy {
    public static ArrayList<object> copy(ArrayList<object> roots){

        int start = 0, end = -1;
        //new space to copy objects in use to it
        ArrayList<object> newSpace = new ArrayList<>();
        //add roots to new space first
        for (object ro : roots) {
            int size = ro.getSize();
            start = end + 1;
            end = start + size - 1;
            ro.setStart_memory(start);
            ro.setEnd_memory(end);
            ro.set_visited();
            newSpace.add(ro);
        }

        //add adjacent of each object exists in new space
        for (int m = 0; m < newSpace.size(); m++) {
            object obj = newSpace.get(m);
            ArrayList<object> adj = obj.get_adjacent();

            for (int j = 0; j < adj.size(); j++) {
                object x = adj.get(j);
                if (x.visited) continue;
                int size = x.getSize();
                start = end + 1;
                end = start + size - 1;
                x.setStart_memory(start);
                x.setEnd_memory(end);
                x.set_visited();
                newSpace.add(x);
            }
        }
        return newSpace;
    }
}
