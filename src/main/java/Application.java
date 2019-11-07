import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.WorkerService;
import service.WorkerServiceImpl;

public class Application
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        WorkerService service = applicationContext.getBean("workerService",WorkerService.class);

        //System.out.println(service.findAll());

        System.out.println(service.checkBasePay());

    }
}
