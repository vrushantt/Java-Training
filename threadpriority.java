import java.security.spec.ECField;

class E1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("running E1");

            try {
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println("Exception occured");
            }
        }
    }

}


class E2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("running E2");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println("Exception occured");
            }
        }
    }

}
public class threadpriority{
    public static void main(String[] args) {
         E1 e1 = new E1();
         E2 e2 = new E2();

//         e2.setPriority(Thread.MAX_PRIORITY);
         System.out.println("THE PRIORITY OF E1 IS "+ e1.getPriority());
        System.out.println("THE PRIORITY OF E1 IS "+ e2.getPriority());

        e1.start();
        e2.start();

    }
}


//sleep method is used to pause the thread for a specified time
//getPriority method is used to get the priority of the thread
//setPriority method is used to set the priority of the thread
//Thread.MAX_PRIORITY is the highest priority
//Thread.MIN_PRIORITY is the lowest priority
//Thread.NORM_PRIORITY is the normal priority
// run method is used to execute the code of the thread
//start method is used to start the thread
//Thread class is used to create a thread
