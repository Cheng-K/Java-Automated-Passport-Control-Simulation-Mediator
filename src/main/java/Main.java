import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executors.newCachedThreadPool().submit(new AutomatedPassportControlSystem());
    }
}