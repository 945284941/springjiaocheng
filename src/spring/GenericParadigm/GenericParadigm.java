package spring.GenericParadigm;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.GenericParadigm.GenericParadigmService.GenericParadigmService;
import spring.GenericParadigm.GenericParadigmServiceImpl.GenericParadigmServiceInteragerImpl;
import spring.GenericParadigm.GenericParadigmServiceImpl.GenericParadigmServiceStringImpl;

/**
 * Created by lxh on 2017/7/18.
 */
@Configuration
public class GenericParadigm {
    @Autowired
    private GenericParadigmService<Integer> gps;
    @Autowired
    private GenericParadigmService<String>  gpsa;
    @Bean             //自动装配了？
    public GenericParadigmServiceInteragerImpl gpg(){
        return new GenericParadigmServiceInteragerImpl();
    }
    @Bean
    public GenericParadigmServiceStringImpl rpg(){
        return new GenericParadigmServiceStringImpl();
    }
    @Bean(name="oo")
    public GenericParadigm oo(){
        System.out.println("int 的"+gps.getClass().getName());
        System.out.println("String 的"+gpsa.getClass().getName());
        return new GenericParadigm();
    }



}
