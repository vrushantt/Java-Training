public class Throwexc{
    public static void main(String[] args) {
        int a=18;
        int b=0;

        try{
            b = 0/a;

            if(b == 0){
                throw new ArithmeticException("This is the default value: The ans is zero");
            }
        }catch(ArithmeticException e){
            b = 18;
            System.out.println("Arithmetic Exception occured"  + e);
        }catch(Exception e){
            System.out.println("Exception occured");
        }
        System.out.println(b);
        System.out.println("After try catch");
    }
}