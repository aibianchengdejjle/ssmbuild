import com.jjl.pojo.User1;
import com.jjl.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TEST {

    @Test
    public void t(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        BookServiceImpl booksServiceImpl = (BookServiceImpl) context.getBean("BookServiceImpl");
        User1 user1 =new User1("admin","123");
        int i = booksServiceImpl.queryUser(user1);
        System.out.println(i);
    }
}
