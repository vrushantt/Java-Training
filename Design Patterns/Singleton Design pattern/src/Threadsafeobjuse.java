public class Threadsafeobjuse  {

    public static void main(String[] args) {
        Threadsafeobjuse obj = new Threadsafeobjuse();
        Threadsafeobjuse obj2 = new Threadsafeobjuse();

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}