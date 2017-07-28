package spring.TwoInterface.CRInterface.CRInterfaceTwo;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.TwoInterface.CRInterface.CRInterface;

/**
 * Created by lxh on 2017/7/13.
 */
@Order(value=1)
@Component
public class CRInterfaceTwo implements CRInterface {
}
