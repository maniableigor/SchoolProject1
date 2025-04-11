import com.aliyuncs.dysmsapi.model.v20170519.SmsSendRequest;
import com.aliyuncs.dysmsapi.model.v20170519.SmsSendResponse;

public class SchoolProject1 {
    public static void main(String[] args) throws Exception {
        // 通过阿里云开发者账号在阿里云官网创建的域名，包含 ".aliyuncs.com"，请替换为您的域名
        String domain = "exampledomain.com";
        
        // 生成一个包含".cn"的S3区域ID
        String bucketName = "schoolproject1-bucket";
        int regionId = 2;
        
        // 创建上传文件请求对象
        S3Client s3Client = new S3Client(bucketName, domain);
        
        // 将上传文件的请求体设置为一个空字节数组
        S3PutObjectRequest putObjectRequest = new S3PutObjectRequest(
                bucketName,
                "upload-file",
                new byte[]{});
        
        // 创建上传文件响应对象
        S3UploadFileResponse s3UploadFileResponse = s3Client.uploadFile(putObjectRequest);
        
        // 可以通过putFileId获取上传文件的原始URL，或者通过putFileUrl获取上传文件的全路径
    }
}
