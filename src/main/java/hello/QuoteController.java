package hello;

import org.springframework.web.bind.annotation.GetMapping;

public class QuoteController {

	@GetMapping("/quotes")
	public String showQuote() {
		
		return "quoteDetails";
	}
}
