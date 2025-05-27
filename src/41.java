import com.aliyun.oss.OSS;
import com.aliyun.oss.model.PutObjectRequest;

public class SchoolProject1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建OSS客户端实例（如果未创建，需要通过配置文件获取）
        OSS ossClient = new OSSBuilder().setRegion("ap-shanghai").build();

        // 2. 创建一个bucket
        String bucketName = "schoolproject1";
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, "test", new File("/home/qwen/code-schoolProject1/"));
        ossClient.putObject(putObjectRequest);

        System.out.println("Bucket created successfully.");
    }
}
