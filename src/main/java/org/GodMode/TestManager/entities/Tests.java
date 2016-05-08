package org.GodMode.TestManager.entities;

import javax.persistence.*;
import java.util.Date;

import java.util.Set;

/**
 * Created by Oleg on 01.05.2016.
 */

@Entity
@Table(name = "tests")
public class Tests {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "t_id")
    private Long tId;

    @Column(name = "test_name", nullable = false, length = 50)
    private String testName;

    @Column(name = "is_public", nullable = false)
    private boolean isPublic;


    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @OneToMany(mappedBy = "tests")
    private Set<TestMarks> testMarks;

    @OneToMany(mappedBy = "tests")
    private Set<Questions> questionses;

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
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

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
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

    public Set<TestMarks> getTestMarks() {
        return testMarks;
    }

    public void setTestMarks(Set<TestMarks> testMarks) {
        this.testMarks = testMarks;
    }

    public Set<Questions> getQuestionses() {
        return questionses;
    }

    public void setQuestionses(Set<Questions> questionses) {
        this.questionses = questionses;
    }
}
