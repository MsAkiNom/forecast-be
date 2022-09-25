package estonia.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class WeatherApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Go to the '/weather' end point to see the json output'";
	}
	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

}
