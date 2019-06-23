package getter;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Blob;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContentSave {

    public void save(String content)
    {
//        new File("");
//        String filePath = "textContent.txt";
//        new File(filePath);
//
////
////        File newFile = new File("newFile_jdk6.txt");
////        boolean success = newFile.createNewFile(newFile);
//// 
////        PrintWriter writer = new PrintWriter("textContent.txt");
////        writer.println("The first line");
////        writer.println("The second line");
////        writer.close();
////
//////        try (Writer writer2 = new BufferedWriter(new OutputStreamWriter(
//////                new FileOutputStream("textContent.txt"))) {
//////            writer2.write("something");
//////        }
////        File file = new File("textContent.txt");
////        FileWriter fileWriter = new FileWriter("textContent.txt");
//////        PrintWriter printWriter = new PrintWriter(fileWriter);
//////        printWriter.print("Some String");
//////        printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
//////        printWriter.close();
////        String str = "Hello";
////        BufferedWriter writer = new BufferedWriter(new FileWriter("someContent.txt"));
////        writer.write(str);
////
////        writer.close();
////        String str = "Hello";
//////        FileOutputStream outputStream = new FileOutputStream("getter/textContent.txt");
//////        byte[] strToBytes = str.getBytes();
//////        outputStream.write(strToBytes);
//////
//////        outputStream.close();
        try{
            FileWriter fw=new FileWriter("C:\\testout.txt");
            fw.write("Welcome to javaTpoint.");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");

    }

    public String searchText(String textContent)
    {
//        String patternString = "/<\\s*p[^>]*>([^<]*)<\\s*\\/\\s*p\\s*>/";
//        textContent= "<p>Hello world</p>";

// Create a Pattern object
        Pattern r = Pattern.compile("<\\s*p[^>]*>(.*?)<\\s*/\\s*p>");

        // Now create matcher object.
        Matcher m = r.matcher(textContent);
        if (m.find( )) {
//            System.out.println("Found value: " + m.group(0) );
//            System.out.println("Found value: " + m.group(1) );
//            System.out.println("Found value: " + m.group(2) );
            return m.group(1);

        }else {
            System.out.println("NO MATCH");
        }

        return textContent;
    }

    public Blob searchImg(Blob imgContent)
    {
        return imgContent;// TODO
    }

}
