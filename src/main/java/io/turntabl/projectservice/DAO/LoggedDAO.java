package io.turntabl.projectservice.DAO;

import io.turntabl.projectservice.Transfers.LoggedProjectTO;
import io.turntabl.projectservice.Transfers.LoggedSickTO;
import io.turntabl.projectservice.Transfers.LoggedVacTO;

import java.util.Map;

public interface LoggedDAO {
    Map<String, Object> addLoggedProject(LoggedProjectTO loggedProjectTO);

    // List<LoggedProjectTO>
    Map<String, Object> getAllLoggedProject();


    Map<String, Object> addLoggedSick(LoggedSickTO loggedSickTO);

    // List<LoggedSickTO>
    Map<String, Object> getAllLoggedSick();

    Map<String, Object> addLoggedVacation(LoggedVacTO loggedVacationTO);

    // List<LoggedVacationTO>
    Map<String, Object> getAllLoggedVacation();



    // List<LoggedTO>
    Map<String, Object> getAllLogged(java.sql.Date endDate);
}
