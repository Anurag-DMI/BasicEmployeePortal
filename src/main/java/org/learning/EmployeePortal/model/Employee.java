package org.learning.EmployeePortal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Getter
@Entity
public class Employee {
    @Id
    private int empId;
    private String name;
    private String department;
    private int salary;


}
