public class UtilityClass {
    public static void waitFor(long miliSeconds){
        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
