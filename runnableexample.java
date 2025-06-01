class eg implements Runnable{
    public void run(){
        System.out.println("Hello eg");
    }
}

class ev implements Runnable{
    public void run(){
        System.out.println("Hello ev");
    }
}


public class runnableexample{
    public static void main(String[] args) {

        eg a = new eg();
        ev b = new ev();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

    }
}