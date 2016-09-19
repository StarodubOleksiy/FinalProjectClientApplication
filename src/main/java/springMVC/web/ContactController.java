package springMVC.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Администратор on 17.09.16.
 */
@Controller
public class ContactController {

    @RequestMapping(value= "/contacts", method = RequestMethod.GET)
    public String schema() {
        return "contacts";
    }

}
