public class multiplecatch{
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int arr[] = new int[5];
        String s = "";
        try{
             b = 18/a;
//             System.out.println(arr[5]);
             System.out.println(s.charAt(5));
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception occured");
        }catch(Exception e){
            System.out.println("Exception occured");
        }

        System.out.println(b);
        System.out.println("After try catch");

    }
}