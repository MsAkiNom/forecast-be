package estonia.weather.Service;

import java.io.IOException;
import org.springframework.stereotype.Service;
import estonia.weather.Request.WeatherRequest;

@Service
public class WeatherService {
    private final WeatherRequest weatherRequest;

    public WeatherService(){
        this.weatherRequest = new WeatherRequest();
    }
    
    public String getWeather() throws IOException {
        return weatherRequest.getJsonWeatherData();
    }
}

