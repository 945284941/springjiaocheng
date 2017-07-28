package spring.Replace.ReplaceDao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by lxh on 2017/7/19.
 */
@Component
public class ReplaceDao {

    public void save(){
        System.out.println("这是保存方法");
    }

}
