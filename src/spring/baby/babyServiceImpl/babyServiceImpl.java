package spring.baby.babyServiceImpl;

import spring.baby.babyDaoImpl.babyDaoImpl;
import spring.baby.babyService.babyService;

/**
 * Created by lxh on 2017/7/13.
 */
public class babyServiceImpl implements babyService {
// * 注入进来的数据要get set方法

    private babyDaoImpl babyDao;

    @Override
    public void babyText(String name) {
        System.out.print("我的名字叫"+name);
    }
    public void batText(String name){babyDao.batText(name);}

    public void setBabyDao(babyDaoImpl babyDao) {
        this.babyDao = babyDao;
    }

    public babyDaoImpl getBabyDao() {
        return babyDao;
    }
}
