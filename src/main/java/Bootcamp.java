import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Bootcamp {

	@RequestMapping("/")
	String home() {
		return "SpringBoot do Bootcamp";
	}

	public static void main(String[] args) {
		SpringApplication.run(Bootcamp.class, args);
	}

}
