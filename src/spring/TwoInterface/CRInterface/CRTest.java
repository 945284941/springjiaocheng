package spring.TwoInterface.CRInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by lxh on 2017/7/13.
 */
@Component
public class CRTest {
    @Autowired
    private List<CRInterface> list;
    @Autowired
    private Map<String,CRInterface> map;

    public void CRTestOne(){
        if(list!=null&&list.size()!=0){
            System.out.print("这是测试list");
            for (CRInterface ls:list) {
                System.out.println(ls.getClass().getName());
            }
        }else{
            System.out.print("list为空!!!");
        }
        if(map!=null&&map.size()!=0){
            for (Map.Entry<String,CRInterface> ms:
                 map.entrySet()) {
                  System.out.println(ms.getKey()+"------"+ms.getValue().getClass().getName());
            }
        }else{
            System.out.print("map为空");
        }
    }
}
