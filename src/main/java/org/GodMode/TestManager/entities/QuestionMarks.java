package org.GodMode.TestManager.entities;

/**
 * Created by Oleg on 01.05.2016.
 */

import javax.persistence.*;

@Entity
@Table(name = "questionqarks")
public class QuestionMarks {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "gm_id")
    private Long gmId;

    @ManyToOne
    @JoinColumn(name = "u_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "q_id")
    private Questions questions;

    @Column(name = "is_right")
    private Boolean isRight;

    public Long getGmId() {
        return gmId;
    }

    public void setGmId(Long gmId) {
        this.gmId = gmId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public Boolean getIsRight() {
        return isRight;
    }

    public void setIsRight(Boolean isRight) {
        this.isRight = isRight;
    }
}


