package estonia.weather.Controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import estonia.weather.Service.WeatherService;

@RestController
@CrossOrigin("*")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public ResponseEntity<String> getWeather() throws IOException{

            String result = weatherService.getWeather();

            if (result == null || result.trim().equals("")) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(result, HttpStatus.OK);
            }
            
        

    }
}
