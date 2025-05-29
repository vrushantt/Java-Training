//when we use final keyword with variable we cannot change its value
//when we use it with method we cannot override it
//when we se it with the class we cannot extends it

class Calc{
    final int age = 21;
    final void show(){
        System.out.println("In calculator by vrushant");
    }
}


public class Final{
    public static void main(String[] args) {
Calc c = new Calc();
System.out.println(c.age);
c.show();
    }
}