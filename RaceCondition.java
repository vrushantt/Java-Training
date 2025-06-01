

class Connter{
    int counter = 0;
    public synchronized void increment(){
        counter++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Connter c = new Connter();

        Runnable r = () -> {
            for(int i=0;i<1000;i++){
                c.increment();

            }
        };

        Runnable r2 = () -> {
            for(int i=0;i<1000;i++){
                c.increment();

            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r2);



        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.counter);

    }
}