package hello;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://mysafeinfo.com/api/data?list=englishmonarchs&format=json")
                .build();

        Response response = null;

        try {
            response = client.newCall(request).execute();

            return response.body().string();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "dhdhd";
    }
}
