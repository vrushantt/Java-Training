abstract class car{
    public abstract void drive();
    public void playmusic(){
        System.out.println("Playing music");
    }
}

class BMW extends car{
    public void drive(){
        System.out.println("Driving BMW");
    }
}

public abstract class Abstract{
    public static void main(String[] args) {

      BMW b = new BMW();
      b.drive();
      b.playmusic();
    }
}