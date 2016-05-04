package org.GodMode.TestManager.entities;


import java.util.Set;

import javax.persistence.*;

/**
 * Created by Oleg on 01.05.2016.
 */

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "u_id")
    private Long uId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "users")
    private Set<TestMarks> testMarks;

    @OneToMany(mappedBy = "users")
    private Set<QuestionMarks> questionMarkses;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<TestMarks> getTestMarks() {
        return testMarks;
    }

    public void setTestMarks(Set<TestMarks> testMarks) {
        this.testMarks = testMarks;
    }

    public Set<QuestionMarks> getQuestionMarkses() {
        return questionMarkses;
    }

    public void setQuestionMarkses(Set<QuestionMarks> questionMarkses) {
        this.questionMarkses = questionMarkses;
    }
}