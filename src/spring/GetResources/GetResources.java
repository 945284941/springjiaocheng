package spring.GetResources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by lxh on 2017/7/18.
 */
@Configuration
@ImportResource("classpath*:/loacl.properties")
public class GetResources {
    @Value("${db_host}")
    private String url;
    @Value("${username}")
    private String name;
    @Value("${db_user}")
    private String password;

    @Bean(name="mde")
    public MyDrvierMessage mdm(){
        return new MyDrvierMessage(url,name,password);
    }
}
