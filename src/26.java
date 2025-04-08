import com.aliyun.oss.OSS;
import com.aliyun.oss.model.PutObjectRequest;

public class SimpleGitHubWorkflow {
    public static void main(String[] args) throws Exception {
        // OSS配置
        String accessKeyId = "your_access_key_id";
        String accessKeySecret = "your_access_key_secret";

        // 项目名称
        String projectName = "SchoolProject1";

        // 源文件路径
        String sourceFilePath = "source.txt";

        // 目标文件路径
        String targetFilePath = "target_file.txt";

        try (OSS ossClient = new OSS(accessKeyId, accessKeySecret)) {
            PutObjectRequest putRequest = new PutObjectRequest(projectName, projectName, sourceFilePath);
            ossClient.putObject(putRequest);

            // 从目标文件夹中移除源文件
            File targetFile = new File(targetFilePath);
            if (targetFile.exists()) {
                targetFile.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
