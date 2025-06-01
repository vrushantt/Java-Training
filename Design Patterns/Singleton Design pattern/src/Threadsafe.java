import com.sun.source.tree.SynchronizedTree;

public class Threadsafe {

    //TO check if obj is created or not we are taking a reference of it
    private static Threadsafe t ;

    //Constructor
    private Threadsafe (){}

    //We create a method to create a obj and that via lazy loading and its thread safe also
    public static Threadsafe getThreadsafeobj(){

        if(t == null){
              //Using a Synchronized Block for therad safety
            synchronized (Threadsafe.class){
               if(t == null){
                   t = new Threadsafe ();
               }
            }
        }
        return t;
    };


}