package spring;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;
import sun.swing.StringUIClientPropertyKey;

/**
 * Created by lxh on 2017/7/13.
 */
public class UnitTestBase {
    private ClassPathXmlApplicationContext context;

    private String springXmlpath;

    public UnitTestBase(){}

    public UnitTestBase(String springXmlpath){
        this.springXmlpath=springXmlpath;
    }
    @Before
    public void before(){
        if(StringUtils.isEmpty(springXmlpath)){
            springXmlpath="classpath*:spring-*.xml";
        }
        try{
            context=new ClassPathXmlApplicationContext(springXmlpath); //获取到文件的内容1
            context.start();
        }catch (BeansException e){
            e.printStackTrace();
        }
    }
    @After
    public void after(){
        context.destroy();
    }
    protected  <T extends Object> T getBean(String beanId){
        return (T)context.getBean(beanId);
    }
    protected  <T extends Object> T getBean(Class<T> clazz){
     return context.getBean(clazz);
    }


}
