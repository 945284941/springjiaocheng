package spring.baby.babyDaoImpl;

import spring.baby.babyDao.babyDao;

/**
 * Created by lxh on 2017/7/13.
 */
public class babyDaoImpl implements babyDao {
    @Override
    public void batText(String name) {
        System.out.print("数据库端"+name);
    }
}
