import java.util.HashSet;
import java.util.Set;

public class set1{
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.remove(10));
        System.out.println(s.isEmpty());
        for(Integer i : s){
            System.out.println(i);
        }
    }
}