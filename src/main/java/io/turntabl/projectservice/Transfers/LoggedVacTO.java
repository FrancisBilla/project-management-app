package io.turntabl.projectservice.Transfers;

import java.sql.Date;

public class LoggedVacTO {

    private Integer employee_id;
    private java.sql.Date vacation_date;


    public LoggedVacTO() {

    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public Date getVacation_date() {
        return vacation_date;
    }

    public void setVacation_date(Date vacation_date) {
        this.vacation_date = vacation_date;
    }
}

