/**
 *
 */

package org.clockin.web.rest.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.clockin.domain.Clockin;

/**
 * @author Miguel Angelo Caldas Gallindo
 */
public class WorkDayDTO {

    private LocalDate date;
    private List<Clockin> clockins;

    private Long workDone;
    private Long workPlanned;

    public WorkDayDTO(LocalDate date) {
        this.date = date;
        this.clockins = new ArrayList<>();
    }

    public boolean getIsMissing() {
        return (clockins.size() % 2 != 0);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Clockin> getClockinValues() {
        return clockins;
    }

    public void setClockinValues(List<Clockin> clockinValues) {
        this.clockins = clockinValues;
    }

    public Long getWorkPlanned() {
        return workPlanned;
    }

    public void setWorkPlanned(long workPlanned) {
        this.workPlanned = workPlanned;
    }

    public void setWorkDone(long workDone) {
        this.workDone = workDone;
    }

    public Long getWorkDone() {
        return workDone;
    }
}
