public class Khaleda {
    
    //Egar/Early Instantiation:
    private static Khaleda khaleda = new Khaleda();
    private Khaleda() {
        System.out.println("Hi Khaleda!");
    }

    public static Khaleda getKhaleda() {
        return khaleda;
    }

}
