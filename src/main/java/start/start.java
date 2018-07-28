package start;

import com.taobao.pandora.boot.PandoraBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by shouchang.zgq on 2018/6/27.
 */
@SpringBootApplication(scanBasePackages = {"com.alibaba.middleware"})
public class start {
    public static void main(String[] args) {
        PandoraBootstrap.run(args);
        SpringApplication.run(start.class, args);
        PandoraBootstrap.markStartupAndWait();
    }
}
