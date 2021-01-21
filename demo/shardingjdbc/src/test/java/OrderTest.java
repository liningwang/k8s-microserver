import com.wang.ShardingJdbcApplication;
import com.wang.entity.Order;
import com.wang.entity.OrderDetail;
import com.wang.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName OrderTest
 * @Description
 * @Author liningwang
 * @Date 2020-11-16 15:57
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcApplication.class)
public class OrderTest {
    @Autowired
    private OrderService orderService;
    @Test
    public void createOrder(){
        Order order = new Order();
        order.setOrderId("2");
        order.setUserId("2");
        order.setOrderAmount("11.23");
        orderService.save(order);
    }
    @Test
    public void createItem(){
        OrderDetail orderDetail = orderService.getOrderDetail("2","2");
        System.out.println("success");
    }
}
