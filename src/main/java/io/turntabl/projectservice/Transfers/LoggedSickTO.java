package io.turntabl.projectservice.Transfers;

import java.sql.Date;

public class LoggedSickTO {

    private Integer employee_id;
    private java.sql.Date sick_date;
    private String employee_firstname;
    private String employee_lastname;
    private String employee_email;

    public LoggedSickTO() {

    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Date getSick_date() {
        return sick_date;
    }

    public void setSick_date(Date sick_date) {
        this.sick_date = sick_date;
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

