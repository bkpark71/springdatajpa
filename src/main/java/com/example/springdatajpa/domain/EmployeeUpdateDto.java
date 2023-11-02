package com.example.springdatajpa.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class EmployeeUpdateDto {
    private String empId;
    private int deptId;
    private int salary;

    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpId() {
        return empId;
    }
    public int getDeptId() {
        return deptId;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
