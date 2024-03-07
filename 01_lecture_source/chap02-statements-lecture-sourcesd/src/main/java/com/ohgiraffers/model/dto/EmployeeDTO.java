package com.ohgiraffers.model.dto;
/*필기.
*   DTO (Data Transfer Object)
*  여러 계층(class) 간의 데이터 전송을 위해 다양한 타입의 데이터를
*  하나로 묶어 전송하는 쓰임의 클래스
*  유사한 말로 VO, Bean, Enitity, (DO, Domain, Row) 등등 많이 불리운다
*  */

import java.sql.Date;

/* 필기.
*   DTO 클래스의 조건
*   1. 기본 생성자와 모든 필드를 초기화 하는 생성자
*   2. 기본 생성자와 모든 필드를 초기화 하는 생성자
*   3. 모든 필드에 대한 getter/setter
*   4. toString Overriding 을 이용한 필드 값 반환용 메소드
* */
public class EmployeeDTO {

    private String empId;
    private String empName;

    private String empNo;

    private String email;

    private String Phone;

    private String deptCode;

    private String jobCode;

    private String salLevel;

    private int salary;

    private double bonus;

    private String managerId;

    private java.sql.Date hireDate;

    private  Date entDate;

    private  String entYn;

    public String getPhone() {
        return Phone;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", email='" + email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerId='" + managerId + '\'' +
                ", hireDate=" + hireDate +
                ", entDate=" + entDate +
                ", entYn='" + entYn + '\'' +
                '}';
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public EmployeeDTO (){}
    public EmployeeDTO(String empId, String empName, String empNo, String email, String deptCode, String jobCode, String salLevel, int salary, double bonus, String managerId, Date hireDate, Date entDate, String entYn) {
        this.empId = empId;
        this.empName = empName;
        this.empNo = empNo;
        this.email = email;
        this.deptCode = deptCode;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
        this.salary = salary;
        this.bonus = bonus;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.entDate = entDate;
        this.entYn = entYn;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getEntDate() {
        return entDate;
    }

    public void setEntDate(Date entDate) {
        this.entDate = entDate;
    }

    public String getEntYn() {
        return entYn;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

}
