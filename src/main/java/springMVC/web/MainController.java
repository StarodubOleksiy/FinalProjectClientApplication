package springMVC.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springMVC.exceptions.ElementNotFoundException;
import springMVC.model.Dish;
import springMVC.service.DishService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;




@Controller
public class MainController  {
    private DishService dishService;

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }

    private DishController dishController;

    @Autowired
    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }

    @RequestMapping(value= "/", method = RequestMethod.GET)

    public String index(Map<String, Object> model) {

        return "index";
    }


    @RequestMapping(value = "/findByWord", method = RequestMethod.POST)
    public ModelAndView findDish(@RequestParam("name") String name) throws ElementNotFoundException {
         ModelAndView modelAndView = new ModelAndView();
        Dish dish = dishService.getDishByName(name);
           if(dish == null) {
             System.out.println("This is exception");
             throw new ElementNotFoundException("This dish have not found!!!");
         }
        modelAndView.addObject("finddish", dish);
        modelAndView.setViewName("index");

    return modelAndView;
}



}




