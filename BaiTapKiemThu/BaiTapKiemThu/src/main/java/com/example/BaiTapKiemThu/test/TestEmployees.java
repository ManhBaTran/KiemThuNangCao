package com.example.BaiTapKiemThu.test;

import com.example.BaiTapKiemThu.entity.Employees;
import com.example.BaiTapKiemThu.sevice.EmployeesSevice;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmployees {
    EmployeesSevice service;

    @BeforeEach
    public void setup() {
        service = new EmployeesSevice();
    }

    @Test
    public void testAddValid() {
        Employees employee = new Employees(1, "John", "Doe", "john.doe@example.com");
        service.addEmployee(employee);
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void updateValid() {
        Employees employee = new Employees(1, "John", "Doe", "john.doe@example.com");
        service.addEmployee(employee);
        Employees updatedEmployee = new Employees(1, "Jane", "Doe", "jane.doe@example.com");
        service.updateEmployee(updatedEmployee, 1);
        Assert.assertEquals("Jane", service.getAll().get(0).getFirstName());
    }

    @Test
    public void deleteValid() {
        Employees employee = new Employees(1, "John", "Doe", "john.doe@example.com");
        service.addEmployee(employee);
        int sizeBefore = service.getAll().size();
        service.deleteEmployee(1);
        int sizeAfter = service.getAll().size();
        Assert.assertEquals(sizeBefore - 1, sizeAfter);
    }

    @Test
    public void testSearchEmployeeValid() {
        Employees employee = new Employees(1, "John", "Doe", "john.doe@example.com");
        service.addEmployee(employee);
        Employees foundEmployee = service.searchEmployee(1);
        Assert.assertEquals(1, foundEmployee.getId());
    }

    @Test
    public void testSearchEmployeeInValid() {
        Employees employee = new Employees(1, "John", "Doe", "john.doe@example.com");
        service.addEmployee(employee);
        Employees foundEmployee = service.searchEmployee(2);
        Assert.assertNull(foundEmployee);
    }
}
