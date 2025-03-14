import java.util.Random;

public class RandomJavaCode {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); // Returns a pseudo-random number between 0 (inclusive) and 10 (exclusive)
        System.out.println("Random Number: " + randomNumber);
    }
}
