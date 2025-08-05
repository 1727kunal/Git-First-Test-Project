package seleniumjavapractise1;

public class UtilityClass {
    public static void waitFor(long miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
