package spring.orgen.orgenServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring.orgen.orgenDao.orgenDao;
import spring.orgen.orgenService.orgenService;

/**
 * Created by lxh on 2017/7/13.
 */
/*@Component*/
/*@Scope() */
@Service//默认单例实例化几次值还是一样的 protptype多个实例化不同的值。 作用域。、
public class orgenServiceImpl implements orgenService {
    @Autowired //不用getset了
    orgenDao od;

    @Override
    public void made(String hu) {
  /*          System.out.print("baby"+this.hashCode());*/
        od.made("啊哈");
    }
}
