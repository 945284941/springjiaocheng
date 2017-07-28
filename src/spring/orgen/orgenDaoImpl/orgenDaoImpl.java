package spring.orgen.orgenDaoImpl;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import spring.orgen.orgenDao.orgenDao;

/**
 * Created by lxh on 2017/7/13.
 */
/*@Component*/

@Repository
public class orgenDaoImpl implements orgenDao {
    @Override
    public void made(String ui) {
         System.out.print("这个是"+ui);
    }
}
