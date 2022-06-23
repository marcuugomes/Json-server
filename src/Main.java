import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;

public class Main {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://localhost:3000/posts/1");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestProperty("accept", "application/json");

        InputStream responseStream = connection.getInputStream();

        ObjectMapper mapper = new ObjectMapper();
        POST myPost = mapper.readValue(responseStream, POST.class);

        System.out.println(myPost.getTitle());
        System.out.println(myPost.getId());
        System.out.println(myPost.getAuthor());
    }
}
