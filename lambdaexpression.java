interface lambda{
    int show(int a,int b);
}

//public class lambdaexpression {
//    public static void main(String[] args) {
//
//        lambda l = (a) -> {
//                System.out.println("showing the lambda expression" + a);
//            };
//        l.show(5);
//    }
//}

public class lambdaexpression {
    public static void main(String[] args) {

            lambda l  = (int a,int b) ->  a+b;



           int result = l.show(5,10);
           System.out.println(result);
    }
}