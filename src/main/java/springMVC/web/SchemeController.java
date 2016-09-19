package springMVC.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Map;

/**
 * Created by Администратор on 04.08.16.
 */
@Controller
public class SchemeController {

    @RequestMapping(value= "/schema", method = RequestMethod.GET)
    public String schema() {
         return "schema";
    }

}
