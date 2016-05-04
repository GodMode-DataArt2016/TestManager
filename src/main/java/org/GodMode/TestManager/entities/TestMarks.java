package org.GodMode.TestManager.entities;

import javax.persistence.*;

@Entity
@Table(name = "TestMarks")
public class TestMarks {

    @Id
    @GeneratedValue
    @Column(name = "tm_id")
    private Long tmId;

    @ManyToOne
    @JoinColumn(name = "u_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "t_id")
    private Tests tests;

    @Column(name = "mark")
    private Long mark;


    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    public Long getMark() {
        return mark;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Tests getTests() {
        return tests;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }
}