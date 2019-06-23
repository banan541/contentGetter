package getter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
//import getter.ExecuteGet;

@SpringBootApplication
public class ContentGetterApplication{

    public static void main(String[] args) {
        SpringApplication.run(ContentGetterApplication.class, args);

        ExecuteGet get = new ExecuteGet();
        String wynik = get.execute("https://pl.simplesite.com/","");
//        System.out.println(wynik);
        ContentSave cs = new ContentSave();
        wynik = cs.searchText(wynik);
        cs.save(wynik);

    }


}
