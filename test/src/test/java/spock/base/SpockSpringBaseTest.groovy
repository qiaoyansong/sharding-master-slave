package spock.base


import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.ComponentScan
import spock.lang.Specification
/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/3/28 23:15
 * description：基于IOC容器的base类
 */
@SpringBootTest(classes = SpockSpringBaseTest.class)
@ComponentScan(basePackages = ["com.sharding.master.slave"])
class SpockSpringBaseTest extends Specification {

}
