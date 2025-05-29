import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map <Integer,String> m = new HashMap<>();

        m.put(1,"Vrushant");
        m.put(2,"Vishal");

        


        System.out.println(m.keySet());

        for(Integer i : m.keySet()){
            System.out.println(i + " " + m.get(i));
        }

    }
}