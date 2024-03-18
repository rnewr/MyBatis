package com.ohgiraffers.section01.xmlmapper;

public class EmpDTO {

    private String id;
    private String name;
    private String number;
    private String phone;
    private String departmentCode;
    private String jobCode;
    private String SalaryLevel;
    private String salary;
    private String bonus;

    public EmpDTO() {}

    public EmpDTO(String id, String name, String number, String phone, String departmentCode, String jobCode, String salaryLevel, String salary, String bonus) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.phone = phone;
        this.departmentCode = departmentCode;
        this.jobCode = jobCode;
        SalaryLevel = salaryLevel;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getSalaryLevel() {
        return SalaryLevel;
    }

    public void setSalaryLevel(String salaryLevel) {
        SalaryLevel = salaryLevel;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "EmpDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", phone='" + phone + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", SalaryLevel='" + SalaryLevel + '\'' +
                ", salary='" + salary + '\'' +
                ", bonus='" + bonus + '\'' +
                '}';
    }

}
