package Task;

public class DoubleCheckLock {
    
    private static  DoubleCheckLock dcl;
    private boolean ok = false;

    private DoubleCheckLock() {
        ok = true;
        System.out.println("DoubleCheckLock");
    }

    public static DoubleCheckLock getInstance() {
        if (dcl == null) {
            synchronized (DoubleCheckLock.class) {
                if (dcl == null) {
                    dcl = new DoubleCheckLock();
                }
            }
        }
        return dcl;
    }

    public void displayMessage() {
        System.out.println("Instance accessed by " + Thread.currentThread().getName());
    }


    public boolean isOk() {
        return ok;
    }
}
