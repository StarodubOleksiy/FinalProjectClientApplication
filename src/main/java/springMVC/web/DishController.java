package springMVC.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springMVC.model.Dish;
import springMVC.model.Menu;
import springMVC.service.DishService;
import springMVC.service.MenuService;

/**
 * Created by Администратор on 04.08.16.
 */


@Controller
public class DishController {



    private DishService dishService;
    private MenuService menuService;


    @Autowired
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }

    @Autowired
    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }



   @RequestMapping(value = "/dishes", method = RequestMethod.GET)
    public String dishes(@RequestParam("menuName")String menuName, Map<String, Object> model) {
      Menu menu =  menuService.getMenuByName(menuName);
       model.put("menu", menu.getName() );
      model.put("dishes", menu.getDishes() );
      return "dishes";
    }

    @RequestMapping(value = "/dish", method = RequestMethod.GET)
    public ModelAndView dish(@RequestParam("dishName")String dishName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dish", dishService.getDishByName(dishName));
        modelAndView.addObject("ingradients", dishService.getDishByName(dishName).getIngradients());
        modelAndView.addObject("image", "club_shema_1.jpg");
        modelAndView.setViewName("dish");
        return modelAndView;
    }



}
