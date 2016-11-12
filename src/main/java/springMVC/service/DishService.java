package springMVC.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger LOGGER = LoggerFactory.getLogger(DishService.class);

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

    @Transactional
    public Dish getDishByName(String dishName){
        LOGGER.info("====================Showing all dishes====================================");
        return dishDao.findByName(dishName);
    }

    @Transactional
    public List<Dish> getDishes() {
        LOGGER.info("====================Showing current dish====================================");
        return dishDao.findAll();
    }


}
