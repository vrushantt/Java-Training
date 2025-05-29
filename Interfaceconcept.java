interface A{

    int age = 22;
    String name = "Vishal";

    void show();
}

class B implements A{
    public void show(){
        System.out.println("showing from B");
    }
}

public class Interfaceconcept {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        System.out.println(B.age);
        System.out.println(A.name);
    }
}