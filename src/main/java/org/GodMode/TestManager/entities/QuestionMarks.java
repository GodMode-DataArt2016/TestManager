package org.GodMode.TestManager.entities;

/**
 * Created by Oleg on 01.05.2016.
 */

import javax.persistence.*;

@Entity
@Table(name = "QuestionMarks")
public class QuestionMarks {

    @Id
    @GeneratedValue
    @Column(name = "gm_id")
    private Long gmId;

    @ManyToOne
    @JoinColumn(name = "u_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "q_id")
    private Question question;

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

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Boolean getRight() {
        return isRight;
    }

    public void setRight(Boolean right) {
        isRight = right;
    }
}


