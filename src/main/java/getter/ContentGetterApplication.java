package getter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ContentGetterApplication{

    public static void main(String[] args) {
        SpringApplication.run(ContentGetterApplication.class, args);

        CententGetter cententGetter = new CententGetter();
        cententGetter.get("https://www.york.ac.uk/teaching/cws/wws/webpage1.html");



    }


}
