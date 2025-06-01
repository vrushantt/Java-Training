class CustomException extends Exception{

    //we will create a constructor
    public CustomException(String message){
        super(message);
    }
}

public class Customexc{
    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        try{
            b = 0/a;
            if(b == 0){
                throw new CustomException("The value of B is zero");
            }
        }catch(CustomException e){
            System.out.println("Arithmetic Exception occured" + e);
        }catch(Exception e){
            System.out.println("Exception occured");
        }
        System.out.println(b);
        System.out.println("After try catch");
    }
}