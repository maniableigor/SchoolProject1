import com.aliyun.oss.OSS;
import com.aliyuncs.profile.DefaultProfile;

public class SimpleOssExample {
    public static void main(String[] args) throws Exception {

        // 配置文件路径
        String accessKeyId = "your-access-key-id";
        String accessKeySecret = "your-access-key-secret";

        // 创建ossClient对象
        OSS ossClient = new OSS.DefaultProfileBuilder().build(accessKeyId, accessKeySecret);

        // 上传图片到oss系统
        ossClient.putObject("test-bucket", "test-object.png");

        // 删除对象
        ossClient.deleteObject("test-bucket", "test-object.png");
    }
}
