import java.util.*;
public class MarkSweep {
    //using breadth first search algorithm to know which objects are used now
    public static void BFS(object root, ArrayList<object> used_objects) {
        if (root.visited){
            return;
        }
        Queue<object> queue = new LinkedList<>();
        root.set_visited();
        queue.add(root);
        while (queue.size() != 0){
            object obj = queue.poll();
            used_objects.add(obj);
            //write to file
           //get adjacent of object , mark it as visited then push it to queue
           ArrayList<object> n = obj.get_adjacent();
           Iterator<object> it = n.listIterator();
           while (it.hasNext()){
              object temp = it.next();
              if (!temp.visited){
                  temp.set_visited();
                  queue.add(temp);
              }
           }
        }
    }
}
