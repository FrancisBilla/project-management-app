package io.turntabl.projectservice.Transfers;

import java.sql.Date;

public class LoggedProjectTO {


    private Integer project_id;
    private Integer project_hours;
    private java.sql.Date project_date;
    private Integer employee_id;
    private String employee_firstname;
    private String employee_lastname;
    private String employee_email;

    public LoggedProjectTO(){

    }

    public Integer getProject_hours() {
        return project_hours;
    }

    public void setProject_hours(Integer project_hours) {
        this.project_hours = project_hours;
    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public Date getProject_date() {
        return project_date;
    }

    public void setProject_date(Date project_date) {
        this.project_date = project_date;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_firstname() {
        return employee_firstname;
    }

    public void setEmployee_firstname(String employee_firstname) {
        this.employee_firstname = employee_firstname;
    }

    public String getEmployee_lastname() {
        return employee_lastname;
    }

    public void setEmployee_lastname(String employee_lastname) {
        this.employee_lastname = employee_lastname;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }
}
