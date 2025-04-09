import com.github.javafaker.Faker;

public class SimpleGitHubWorkflow {

    public static void main(String[] args) {
        // Generate some fake data to make up examples in your project
        Faker faker = new Faker();

        System.out.println("Hello, GitHub! This is an example of a simple Java code.");
        
        // Example 1: Print text
        System.out.println(faker.name().fullName());
        
        // Example 2: Show a random number between 1 and 10
        int randomNumber = faker.randomNumberBetween(1, 10);
        System.out.println(randomNumber);
        
        // Example 3: Display an image URL
        String imageUrl = "https://www.example.com/image.jpg";
        if (imageUrl != null) {
            System.out.println("Example image is at: " + imageUrl);
        }
    }
}
