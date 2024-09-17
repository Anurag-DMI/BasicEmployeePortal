package org.learning.EmployeePortal.controller;

import org.learning.EmployeePortal.model.Employee;
import org.learning.EmployeePortal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService service;

    // To get list of all employees
    @GetMapping("allemp")
    public List<Employee> getAllEmp(){
        System.out.println("Get a list of all employees");
        return service.getAllEmp();
    }

    // To get employee using empId
    @GetMapping("emp/{empId}")
    public Employee getEmp(@PathVariable("empId") int empId){
        return service.getEmp(empId);
    }

    // To add a new employee
    @PostMapping("emp")
    public String addEmp(@RequestBody Employee emp){
        if(service.addEmp(emp)) return "Employee added";
        return "Employee with same EmpId already present";
    }

    // To update an employee
    @PutMapping("emp")
    public String updateEmp(@RequestBody Employee emp){
        if(service.updateEmp(emp)){
            return "Employee updated";
        }
        return "Employee not found/Error occurred";
    }


    // To delete an employee
    @DeleteMapping("emp/{empId}")
    public String deleteEmp(@PathVariable("empId") int empId){
        if(service.deleteEmp(empId)){
            return "Employee deleted";
        }
        return "Employee not found";
    }
}
