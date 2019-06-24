package getter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ContentGetterApplication{

    public static void main(String[] args) {
        SpringApplication.run(ContentGetterApplication.class, args);

        ContentGetter contentGetter = new ContentGetter();
//        contentGetter.getAll("https://www.york.ac.uk/teaching/cws/wws/webpage1.html");

    }


}
