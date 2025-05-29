class outerclass{
    public void show(){
        System.out.println("showing from outer class");
    }
    class innerclas{
        public void show(){
            System.out.println("showing from inner class");
        }
    }
}

public class innerclass{
    public static void main(String[] args) {
        outerclass o = new outerclass();
        o.show();

        outerclass.innerclas i = o.new innerclas();
        i.show();
    }
}