package org.GodMode.TestManager.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Oleg on 01.05.2016.
 */

@Entity
@Table(name = "Tests")
public class Tests {

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "t_id")
    private long tId;

    @Column(name = "testName", nullable = false, length = 50)
    private String testName;

    @Column(name = "is_public", nullable = false)
    private boolean isPublic;


    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_Date")
    private Date endDate;

    public Tests() {
    }

    public long gettId() {
        return tId;
    }

    public void settId(long tId) {
        this.tId = tId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
