import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SchoolProject1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // Make sure chromedriver is in the PATH
        Faker faker = new Faker();
        
        // Generate random data for demonstration purposes
        System.out.println("Hello, World!");
        String name = faker.name().sniffer().fullName(5);
        int age = 20;
    }
}
