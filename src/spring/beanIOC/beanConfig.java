package spring.beanIOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.beanIOC.beanService.beanService;
import spring.beanIOC.beanServiceImpl.beanServiceImpl;

/**
 * Created by lxh on 2017/7/18.
 */
@Configuration
public class beanConfig {
//调用了那个方法
    @Bean(name="baby",initMethod ="init",destroyMethod = "destroy")
    public beanService getBaby(){
        return new beanServiceImpl();
    }


}
