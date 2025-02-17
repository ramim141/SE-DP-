public class Hasina {
    private static Hasina hasina;

    private  Hasina() {
        System.out.println("Hi Hasina!");
    }

    public static Hasina getHasina() {
        // obj create
        if (hasina == null) {
            // others code
            synchronized(Hasina.class) {
                if (hasina == null) {
                    hasina = new Hasina();
                }
                return hasina;
               
            }
            // others code
        }
        return hasina;
       
    }
    
}
