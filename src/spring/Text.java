package spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import spring.GenericParadigm.GenericParadigm;
import spring.GenericParadigm.GenericParadigmService.GenericParadigmService;
import spring.GetResources.GetResources;
import spring.GetResources.MyDrvierMessage;
import spring.Replace.ReplaceService;
import spring.TwoInterface.CRInterface.CRTest;
import spring.baby.babyService.babyService;
import spring.baby.babyServiceImpl.babyServiceImpl;
import spring.beanIOC.beanService.beanService;
import spring.buildAop.buildAop;
import spring.orgen.orgenService.orgenService;

/**
 * Created by lxh on 2017/7/13.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class Text extends UnitTestBase{

    public Text(){
        super("classpath*:springxml/spring-baby.xml");//spring路径
    }
    @Test
    public void testHello(){
        babyService bs=super.getBean("babyService");
        bs.babyText("ao");
        bs.batText("你好");
    }
    @Test
    public void testComp(){
        orgenService os=super.getBean("orgenServiceImpl");
        os.made("A");
        orgenService osd=super.getBean("orgenServiceImpl");
        osd.made("A");
    }
    @Test
    public void InterfaceTest(){
        CRTest ct=super.getBean("CRTest");//mede坑爹。
        ct.CRTestOne();
    }
    @Test
    public void beanIOCTest(){
        beanService bs=super.getBean("baby");
        System.out.println(bs.getClass().getName());
    }
    @Test
    public void myDrea(){
        MyDrvierMessage gr=super.getBean("mde");
        System.out.println(gr.getClass().getName());
    }
    @Test
    public void wen(){
        GenericParadigm gp=super.getBean("oo");
    }
    @Test
    public void replace(){
        ReplaceService rs= super.getBean("replaceService");
        rs.baby();
    }
    @Test
    public void bua(){
        buildAop ba=super.getBean("buildA");
        ba.ao();
    }
}
