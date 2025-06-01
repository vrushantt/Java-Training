class example{
    public void show() throws Exception{
        Class.forName("hello"); //created a class not found exception
    }
}

public class throwsexample{

    public static void main(String[] args) {

        example t = new example();

        try {
            t.show();
        }catch(Exception e){
            System.out.println("Exception occured");
        }
        System.out.println("After try catch");
    }
}