package spring.beanIOC.beanServiceImpl;

import spring.beanIOC.beanService.beanService;

/**
 * Created by lxh on 2017/7/18.
 */
public class beanServiceImpl implements beanService {

    public void init(){
        System.out.println("方法开始~！！！！");
    }
    public void destroy(){
        System.out.println("方法结束~！！！！");
    }
}
