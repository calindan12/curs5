import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Task firstTask = context.getBean("task" , Task.class);
        Task secondTask = context.getBean("task" , Task.class);
        Task thirdTask = context.getBean("task" , Task.class);

        firstTask.runMethod();

        context.close();

    }
}
