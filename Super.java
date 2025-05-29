 class personh{
    String name;
    personh(String name){
        this.name = name;
    }
}
 class Engineer extends personh{
    String course;

    Engineer(String name, String course){
        super(name);
        this.course = course;
    }
 }


public class Super{
    public static void main(String[] args) {
        Engineer e = new Engineer("Vishal", "Computer Science");
  System.out.println(e.name + " " + e.course);
    }
}