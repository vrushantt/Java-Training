class person{
   private String name;
   private int age;

   public void setName(String name){
       this.name = name;
   }
   public void setAge(int age){
       this.age = age;
   }

   public String getName(){
       return name;
   }

   public int getAge(){
       return age;
   }
}


public class Encapsulation {
    public static void main(String[] args) {
        person p = new person();
        p.setName("Vishal");
        p.setAge(20);
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }
}