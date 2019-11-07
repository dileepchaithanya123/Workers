import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repository.WorkerRepositoryImpl;
import service.WorkerService;
import service.WorkerServiceImpl;

@Configuration
@ComponentScan({"java"})
public class AppConfig {
    @Bean(name="workerService")
    public WorkerService getWorkerService()
    {
        WorkerServiceImpl service = new WorkerServiceImpl();
        return service;
    }

    @Bean(name="customerRepository")
    public WorkerRepositoryImpl getWorkerRepository() {
        return new WorkerRepositoryImpl();
    }


}
