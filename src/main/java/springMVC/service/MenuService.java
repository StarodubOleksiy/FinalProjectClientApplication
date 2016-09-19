package springMVC.service;

import org.springframework.transaction.annotation.Transactional;
import springMVC.dao.DishDao;
import springMVC.dao.MenuDao;
import springMVC.model.Dish;
import springMVC.model.Menu;

import java.util.List;

/**
 * Created by Администратор on 30.08.16.
 */
public class MenuService {

    private MenuDao menuDao;

    public void setMenuDao(MenuDao menuDao) {
        this.menuDao = menuDao;
    }



    @Transactional
    public List<Menu> getMenu() {
        return menuDao.showAll();
    }

    @Transactional
    public Menu getMenuByName(String menuName){
        return menuDao.findByName(menuName);
    }

}
