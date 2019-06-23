package getter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContentSave {

    public void save(String content)
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss-SSS");

        try{
            FileWriter fw=new FileWriter("C:\\wyniki\\content_"+ sdf.format(cal.getTime()) +".txt");
            fw.write(content);
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }

    public void saveImg( Image image){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss-SSS");

        File outputfile = new File("C:\\wyniki\\content_"+ sdf.format(cal.getTime()) +".jpg");

        BufferedImage bufferedImage = null;

        bufferedImage = toBufferedImage(image);

        try {
            ImageIO.write(bufferedImage, "jpg", outputfile);

        } catch (IOException e) {
        }
    }


    public String searchText(String textContent, String regEx)
    {

//        Pattern r = Pattern.compile("<\\s*p[^>]*>(.*?)<\\s*/\\s*p>");
        Pattern r = Pattern.compile(regEx);

        // Now create matcher object.
        Matcher m = r.matcher(textContent);
        if (m.find( )) {
//            System.out.println("Found value: " + m.group(0) );
//            System.out.println("Found value: " + m.group(1) );
            return m.group(1);

        }else {
            System.out.println("NO MATCH");
            return "";
        }
    }

    public Image imageFromLink(String textContent) {
        Image image = null;
        try {
            URL url = new URL(textContent);
            image = ImageIO.read(url);
        } catch (IOException e) {
        }
        return image;
    }

    public static BufferedImage toBufferedImage(Image img)
    {
        if (img instanceof BufferedImage)
        {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }

}
