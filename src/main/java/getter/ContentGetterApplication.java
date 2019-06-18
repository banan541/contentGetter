package getter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import javax.persistence.Table;

@SpringBootApplication
public class ContentGetterApplication extends SpringBootServletInitializer {

//    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ContentGetterApplication.class, args);

//        context.getBean(Table.class).fillWithTestdata(); // <-- here

    }


}
