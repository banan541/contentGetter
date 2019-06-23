package getter;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ExecuteGet{
//
//    public void GetContentAction() {
////    String paramValue = "https:%5C%5Cpl.simplesite.com";
////    String yourURLStr = java.net.URLEncoder.encode(paramValue, "UTF-8");
////    java.net.URL url = new java.net.URL(yourURLStr);
////    HttpURLConnection con = (HttpURLConnection) url.openConnection();
////    con.setRequestMethod("GET");
//
//    String url = "http://www.google.com/search?q=mkyong";
//
//    URL obj = new URL(url);
//
//    }

    public static String execute(String targetURL, String urlParameters) {
        HttpURLConnection connection = null;

        try {
            //Create connection
            URL url = new URL(targetURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

//            connection.setRequestProperty("Content-Length",
//                    Integer.toString(urlParameters.getBytes().length));
//            connection.setRequestProperty("Content-Language", "en-US");

//            connection.setUseCaches(false);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream (
                    connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.close();

            //Get Response
            InputStream is = connection.getInputStream();
//            System.out.println(is.toString()+"_1");
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
//            System.out.println(rd.toString()+"_2");

            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
//            System.out.println(response.toString()+"_3");

            String line;
            while ((line = rd.readLine()) != null) {
//                System.out.println(line+"_line");
                response.append(line);
//                response.append('\r');
            }
            rd.close();
//            System.out.println(response.toString()+"_4");
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}

