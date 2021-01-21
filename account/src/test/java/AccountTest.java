import com.wang.AccountApplication;
import com.wang.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName AccountTest
 * @Description
 * @Author liningwang
 * @Date 2020-10-30 14:38
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AccountApplication.class})
public class AccountTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void testAccount(){
        accountService.debit("1",200);
    }
}
