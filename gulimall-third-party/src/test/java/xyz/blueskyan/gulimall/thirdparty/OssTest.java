package xyz.blueskyan.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
public class OssTest {

    @Autowired
    private OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
        ossClient.putObject("gulimall-blueskyan", "test1.png", new FileInputStream("C:\\Users\\Shelumiel Yan\\Pictures\\壁纸\\wallhaven-pkmxgm.png"));
    }
}
