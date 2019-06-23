package getter;

import java.awt.*;

public class CententGetter {

    public void get(String url){

        ExecuteGet get = new ExecuteGet();
        String allContent = get.execute(url,"");
        String toSave = "";
//        System.out.println(allContent);
        ContentSave cs = new ContentSave();
        //Znajdź text
        toSave = cs.searchText(allContent, "<\\s*p[^>]*>(.*?)<\\s*/\\s*p>");
        cs.save(toSave);
        //Znajdź link do zdjęcia
        String imgLink = "";
        imgLink = cs.searchText(allContent,"<img[^>]+src=\"([^\">]+)\"" );
//        cs.save(imgLink);
        Image image = null;
        image = cs.imageFromLink(imgLink);
        cs.saveImg(image);

    }
}
