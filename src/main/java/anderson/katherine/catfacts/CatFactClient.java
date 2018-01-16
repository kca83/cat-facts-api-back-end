package anderson.katherine.catfacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CatFactClient {

    @Autowired
    private RestTemplate restTemplate;

    private final String API_URL = "https://catfact.ninja/fact";

    public CatFact getRandomCatFact() {
        return restTemplate.getForObject(API_URL, CatFact.class);
    }
}