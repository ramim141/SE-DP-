package Task;

public class Main {
    public static void main(String[] args) {

        // DoubleCheckLock dcl1 = DoubleCheckLock.getInstance();
        // DoubleCheckLock dcl2 = DoubleCheckLock.getInstance();
        Runnable task = () -> {
            DoubleCheckLock singleton = DoubleCheckLock.getInstance();
            if(singleton.isOk()){
                singleton.displayMessage();
            }
         
        };

        // System.out.println(dcl1.isOk());

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
      

     
        System.out.println("All threads completed");
        

    }
}
