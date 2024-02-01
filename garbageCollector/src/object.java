import java.util.ArrayList;
import java.util.Comparator;

public class object{
    private int object_identifier;
    private int start_memory;
    private int end_memory;
    private int size;
    boolean visited; // false means not used
    //store children of object in arraylist
    private ArrayList<object> adjacent = new ArrayList<>();
    public object(int object_identifier, int start_memory, int end_memory){
        this.object_identifier = object_identifier;
        this.start_memory = start_memory;
        this.end_memory = end_memory;
        this.visited = false;
        this.size = end_memory - start_memory + 1;
    }

    void add_child(object obj){this.adjacent.add(obj);}
    ArrayList<object> get_adjacent(){
        return this.adjacent;
    }

    int getObject_identifier(){
        return object_identifier;
    }
    int get_startMemory(){
        return start_memory;
    }
    int get_endMemory(){
        return end_memory;
    }

    int getSize(){
        return size;
    }
    void set_visited(){
        this.visited = true;
    }
    void setStart_memory(int start_memory){
        this.start_memory = start_memory;
    }

    void setEnd_memory(int end_memory){
        this.end_memory = end_memory;
    }


    //function to sort objects
    public static Comparator<object> startMemory = new Comparator<object>() {

        // Method
        public int compare(object o1, object o2) {

            int o1StartMemory = o1.get_startMemory();
            int o2StartMemory = o2.get_startMemory();

            // For ascending order
            return o1StartMemory - o2StartMemory;

        }
    };
}
