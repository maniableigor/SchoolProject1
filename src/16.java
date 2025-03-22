import com.aliyuncs.dysdk.v20200819.DysConfig;
import com.aliyuncs.dysdk.v20200819.model.AwsProject;

public class SchoolProject1 {

    public static void main(String[] args) {
        // Initialize the AWS configuration
        DysConfig.init(null, null);

        // Get the AWS project details
        AwsProject awsProject = new AwsProject().get();

        // Print the AWS project details to the console
        System.out.println("AWS Project Details:");
        System.out.println(awsProject);
    }
}
