package springMVC.service;

import org.springframework.transaction.annotation.Transactional;
import springMVC.dao.EmployeeDao;
import springMVC.model.Employee;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Администратор on 31.07.16.
 */


public class EmployeeService {

    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Transactional
    public Employee getEmployeeByName(String employeeName){
        LOGGER.info("====================Showing current employee====================================");
        return employeeDao.findByName(employeeName);
    }

    @Transactional
    public List<Employee> getEmployees() {
        LOGGER.info("====================Showing all employees====================================");
        return employeeDao.findAll();
    }

}
