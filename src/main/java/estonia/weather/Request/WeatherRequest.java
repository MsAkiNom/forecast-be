package estonia.weather.Request;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import java.io.IOException;

public class WeatherRequest {

    public String getJsonWeatherData() throws IOException {

        String url = "http://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php?lang=eng";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        XmlMapper xmlMapper = new XmlMapper();
        JsonNode jsonNode = xmlMapper.readTree(client.newCall(request).execute().body().bytes());
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(jsonNode);

        return jsonData;
    }

}
