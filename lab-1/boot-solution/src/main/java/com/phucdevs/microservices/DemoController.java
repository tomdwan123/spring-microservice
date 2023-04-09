package microservices.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @Autowired
    TeamRepository repository;

    @RequestMapping("/hi/{name}")
    public @ResponseBody Team hello(@PathVariable String name) {
        return repository.findByName(name);
    }
}
