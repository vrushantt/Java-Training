public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Vrushant");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
        System.out.println(sb.replace(2,4,"HELLO"));
        System.out.println(sb.append("Khambhu"));
        System.out.println(sb.substring(1,5));
        System.out.println(sb.delete(1,2));
    }
}