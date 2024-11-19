package urlshortener.main.urlshortener;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/{id}")
    public String accessUrl(@PathVariable() String id) {
        System.out.println(id);
        return "index";
    }
}
