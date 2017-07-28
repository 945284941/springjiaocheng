package spring.Replace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import spring.Replace.ReplaceDao.ReplaceDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by lxh on 2017/7/19.
 */
@Service
public class ReplaceService {
    @Autowired
    private ReplaceDao rd;

    @PostConstruct
    public void init(){
        System.out.println("方法启动。。。");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("方法销毁。。。");
    }


    public ReplaceService baby(){
        rd.save();
        return new ReplaceService();
    }
}
