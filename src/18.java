import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("/test")
    public String test(@RequestBody String requestBody) {
        // Your code here
        return "Test Response";
    }
}
