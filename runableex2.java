public class runableex2{

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("hii");
                    try{
                        Thread.sleep(10);
                    }catch(Exception e){
                        System.out.println("Exception occured");
                    }
                }
            }
        };

        Runnable r2 = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(10);
                }catch(Exception e){
                    System.out.println("Exception occured");
                }
            }
        };

        Thread t = new Thread(r);
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}