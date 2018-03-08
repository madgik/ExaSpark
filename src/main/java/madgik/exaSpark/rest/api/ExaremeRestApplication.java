package madgik.exaSpark.rest.api;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExaremeRestApplication {
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		SpringApplication.run(ExaremeRestApplication.class, args);
	}

}
