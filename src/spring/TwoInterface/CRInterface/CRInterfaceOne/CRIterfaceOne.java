package spring.TwoInterface.CRInterface.CRInterfaceOne;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.TwoInterface.CRInterface.CRInterface;

/**
 * Created by lxh on 2017/7/13.
 */
@Order(value=2)
@Component
public class CRIterfaceOne implements CRInterface {
}
