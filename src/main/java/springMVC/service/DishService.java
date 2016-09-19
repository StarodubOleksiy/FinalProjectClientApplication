package springMVC.service;

import org.springframework.transaction.annotation.Transactional;
import springMVC.dao.DishDao;
import springMVC.model.Dish;
import springMVC.model.Employee;

import java.util.List;

/**
 * Created by Администратор on 06.08.16.
 */
public class DishService {

    private DishDao dishDao;

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

    @Transactional
    public Dish getDishByName(String dishName){
        return dishDao.findByName(dishName);
    }

    @Transactional
    public List<Dish> getDishes() {
        return dishDao.findAll();
    }


}
