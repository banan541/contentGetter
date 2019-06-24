package getter;

import java.awt.*;

public class ContentGetter {

    public String getText(String url){

        ExecuteGet get = new ExecuteGet();
        String allContent = get.execute(url,"");
        String toSave = "";
//        System.out.println(allContent);
        ContentSave cs = new ContentSave();
        //Znajdź text
        toSave = cs.searchText(allContent, "<\\s*p[^>]*>(.*?)<\\s*/\\s*p>");
        cs.save(toSave);
        return toSave;
    }

    public Image getImg(String url){

        ExecuteGet get = new ExecuteGet();
        String allContent = get.execute(url,"");

        ContentSave cs = new ContentSave();
        String imgLink = "";
        imgLink = cs.searchText(allContent,"<img[^>]+src=\"([^\">]+)\"" );
        Image image = cs.imageFromLink(imgLink);
        cs.saveImg(image);
        return image;
    }

    public void getAll(String url) {
        getText(url);
        getImg(url);
    }
}
