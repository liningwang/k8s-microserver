import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.wang.OrderApplication;
import com.wang.entity.AccountEntity;
import com.wang.entity.Order;
import com.wang.mapper.OrderMapper;
import com.wang.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName ConfigFactoryTest
 * @Description
 * @Author liningwang
 * @Date 2020-11-03 14:37
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class ConfigFactoryTest {
    @Autowired
    private OrderMapper orderMapper;
    @Test
    public void testConfig(){
        Config config = ConfigFactory.load("file.conf");
        String str = config.getString("service.vgroupMapping.my_test_tx_group");
        System.out.println("str" + str);
    }
    @Test
    public void insertOrder(){
        Order order = new Order();
        order.setUserId("1");
        order.setCommodityCode("1111");
        order.setMoney(12);
        orderMapper.insert(order);
    }
    @Test
    public void get(){
        UpdateWrapper<Order> updateWrapper = new UpdateWrapper<>();
        orderMapper.selectCount(updateWrapper);
    }
}
