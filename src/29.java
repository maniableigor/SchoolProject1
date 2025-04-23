import com.aliyun.cas.CASClient;
import com.aliyun.cas.model.response.LoginResponse;

public class CasExample {
    public static void main(String[] args) throws Exception {
        CASClient casClient = new CASClient();
        LoginResponse loginResponse = casClient.login("alice", "alice");
        System.out.println("Logged in successfully: " + loginResponse.getName());
    }
}
