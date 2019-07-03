package hello;


import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.RestTemplate;

public class QuoteService {
	
	
	private RestTemplate restTemplate;
	

	public QuoteService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
		restTemplate.getInterceptors().add(
				new BasicAuthorizationInterceptor("admin","admin"));
	}

	public Quote getQuote() {
		return restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);		
	}

}
