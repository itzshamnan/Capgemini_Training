import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Q6_HTTP {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://httpbin.org/get");
            HttpURLConnection con=(HttpURLConnection)url.openConnection();

            System.out.println("Response Code:"
                    + con.getResponseCode());
            System.out.println("Response Message:"
                    + con.getResponseMessage());
            Map<String, List<String>> map = con.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() +
                        ":" + entry.getValue());
            }
            BufferedReader in = new BufferedReader(new InputStreamReader( con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
            con.disconnect();
        }catch(Exception e){System.out.println(e);}
    }
}
