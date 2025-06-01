
@FunctionalInterface
interface MyFunctionalInterface {
    void show();
}

public class functionalinterface {
    public static void main(String[] args) {

        MyFunctionalInterface m = new MyFunctionalInterface() {
            public void show(){
                System.out.println("showing from functional interface");
            }
        };

        m.show();
    }
}