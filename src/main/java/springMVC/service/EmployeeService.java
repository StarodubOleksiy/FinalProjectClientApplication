package springMVC.service;

import org.springframework.transaction.annotation.Transactional;
import springMVC.dao.EmployeeDao;
import springMVC.model.Employee;
import java.util.List;

/**
 * Created by Администратор on 31.07.16.
 */


public class EmployeeService {

    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Transactional
    public Employee getEmployeeByName(String employeeName){
        return employeeDao.findByName(employeeName);
    }

    @Transactional
    public List<Employee> getEmployees() {
        return employeeDao.findAll();
    }

}
