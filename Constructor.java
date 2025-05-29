class Person{

    public String name;
    public int age;
    public String species;

     Person(String name, int age){
         this.name = name;
         this.age = age;
        this.species = "Homo Sapiens";
    }


}


public class Constructor{
    public static void main(String[] args) {
        Person p = new Person("Vrushant",21);

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.species);
    }
}