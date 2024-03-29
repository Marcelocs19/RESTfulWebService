package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootApplication {

	private static final Logger log = LoggerFactory.getLogger(BootApplication.class);

	public static void main(String args[]) {
		SpringApplication.run(BootApplication.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		log.info(" *** **** Creating a REST Template");
		return builder.build();
	}

	@Bean
	public QuoteService quoteService(RestTemplate restTemplate) {
		log.info(" *** **** Creating a Quote service");
		return new QuoteService(restTemplate);
	}
	

}