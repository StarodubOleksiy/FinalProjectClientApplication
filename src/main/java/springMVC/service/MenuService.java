package springMVC.service;

import org.springframework.transaction.annotation.Transactional;
import springMVC.dao.DishDao;
import springMVC.dao.MenuDao;
import springMVC.model.Dish;
import springMVC.model.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Администратор on 30.08.16.
 */
public class MenuService {

    private MenuDao menuDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(MenuService.class);
    public void setMenuDao(MenuDao menuDao) {
        this.menuDao = menuDao;
    }



    @Transactional
    public List<Menu> getMenu() {
        LOGGER.info("====================Showing all menu====================================");
        return menuDao.showAll();
    }

    @Transactional
    public Menu getMenuByName(String menuName){
        LOGGER.info("LOGGER.info(\"====================Finding menu "+menuName+"====================================\");");
        return menuDao.findByName(menuName);
    }

}
