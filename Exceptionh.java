public class Exceptionh{
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int ans;

        try{
            ans = 18/b;
            System.out.println(ans);
        }catch (Exception e){
            System.out.println("Error"+ e);
        }
         System.out.println("After try catch");

    }
}