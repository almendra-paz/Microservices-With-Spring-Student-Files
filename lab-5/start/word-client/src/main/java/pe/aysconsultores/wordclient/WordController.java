package pe.aysconsultores.wordclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

	@Value("${words}")
	String words;
	//String words = "prueba,prueba,prueba,prueba";

	@GetMapping("/")
	public String getWorkds(){
		String[] wordArray = words.split(",");
		int i = (int)Math.round(Math.random() * (wordArray.length - 1));
		return wordArray[i];
	}
}
