package anderson.katherine.catfacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catFact")
public class CatFactController {

    @Autowired
    CatFactClient catFactClient;

    @RequestMapping(method = RequestMethod.GET)
    public CatFact getRandomCatFact() {
        return catFactClient.getRandomCatFact();
    }
}
