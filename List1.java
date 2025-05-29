import java.util.ArrayList;
import java.util.List;

public class List1{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);

         System.out.println(l.get(1));
        System.out.println(l.set(1,50));
        System.out.println(l.remove(1));
        System.out.println(l.size());
        for(Integer i : l){
            System.out.println(i);
        }
    }
}