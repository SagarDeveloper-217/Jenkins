package Spring_Jenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;



@SpringBootApplication
public class JenkinsApplication {
	
	public static org.slf4j.Logger Logger=LoggerFactory.getLogger(JenkinsApplication.class);
	
	@PostConstruct
	public void intt(){
		Logger.info("Applicarion Started ...");
	}

	public static void main(String[] args) {
		Logger.info("Applicarion executed ...");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
