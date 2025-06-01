class E extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("running E");
        }

    }
}

class F extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("running F");
        }

    }
}


public class ThreadExample {
    public static void main(String[] args) {

        E e = new E();
        F f = new F();

        e.start();
        f.start();
    }
}