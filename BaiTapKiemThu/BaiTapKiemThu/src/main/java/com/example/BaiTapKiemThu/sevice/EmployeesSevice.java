package com.example.BaiTapKiemThu.sevice;

import com.example.BaiTapKiemThu.entity.Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeesSevice {
    private List<Employees> danhSachEmployees = new ArrayList<>();

    public void addEmployee(Employees employee) {
        danhSachEmployees.add(employee);
    }

    public void updateEmployee(Employees employee, int id) {
        for (Employees emp : danhSachEmployees) {
            if (emp.getId() == id) {
                emp.setFirstName(employee.getFirstName());
                emp.setLastName(employee.getLastName());
                emp.setEmail(employee.getEmail());
                return;
            }
        }
    }

    public void deleteEmployee(int id) {
        danhSachEmployees.removeIf(emp -> emp.getId() == id);
    }

    public Employees searchEmployee(int id) {
        for (Employees emp : danhSachEmployees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public List<Employees> getAll() {
        return danhSachEmployees;
    }
}
