package springMVC.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.service.MenuService;

import java.util.Map;

/**
 * Created by Администратор on 30.08.16.
 */

@Controller
public class MenuController {
    private MenuService menuService;

    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }



    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menu(Map<String, Object> model) {
        model.put("menu", menuService.getMenu() );
        return "menu";
    }
}
