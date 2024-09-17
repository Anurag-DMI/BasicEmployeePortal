package org.learning.EmployeePortal.service;

import org.learning.EmployeePortal.model.Employee;
import org.learning.EmployeePortal.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    // To get list of all employees
    public List<Employee> getAllEmp() {
//        return repo.getAllEmp();
        return repo.findAll();
    }

    // To get employee using EmpID
    public Employee getEmp(int empId) {
//        return repo.getEmp(empId);
        return repo.findById(empId).orElse(new Employee());
    }

    // To add employee
    public boolean addEmp(Employee emp) {
//        return repo.addEmp(emp);
        if(repo.existsById(emp.getEmpId())) return false;
        repo.save(emp);
        return true;
    }

    // To update an employee data
    public boolean updateEmp(Employee emp) {
//        return repo.updateEmp(emp);
        if(repo.existsById(emp.getEmpId())) {
            repo.save(emp);
            return true;
        }
        return false;
    }

    // To delete an employee data
    public boolean deleteEmp(int empId) {
//        return repo.deleteEmp(empId);
        if(repo.existsById(empId)) {
            repo.deleteById(empId);
            return true;
        }
        return false;
    }
}
