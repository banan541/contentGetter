package getter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class ContentGetterApplication{

    public static void main(String[] args) {
        SpringApplication.run(ContentGetterApplication.class, args);

        CententGetter cententGetter = new CententGetter();
        cententGetter.get("https://berta.me/images-or-text-does-one-demand-higher-priority-than-the-other/");



    }


}
