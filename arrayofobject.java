class Student{
    public String name;
    public int age;
    public String course;
}

public class arrayofobject {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vishal";
        s1.age = 20;
        s1.course = "Computer Science";

        Student s2 = new Student();
        s2.name = "Rakesh";
        s2.age = 21;
        s2.course = "Computer Science";

        Student s3 = new Student();
        s3.name = "Raj";
        s3.age = 24;
        s3.course = "Computer Science";


        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;

        for(Student st: s){
            System.out.println(st.name + " " + st.age + " " + st.course);
        }
    }
}