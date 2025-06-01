public class client {
    public static void main(String[] args) {

        employee e =  employeefactory.getEmployee("webdeveloper");
        System.out.println(e);
        e.salary();

        employee e2 =  employeefactory.getEmployee("androiddeveloper");
        e2.salary();
    }

}