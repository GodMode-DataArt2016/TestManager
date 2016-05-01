package org.GodMode.TestManager.entities;

import javax.persistence.*;

/**
 * Created by Oleg on 01.05.2016.
 */

@Entity
@Table(name = "Answers")
public class Answers {

    @Id
    @GeneratedValue
    @Column(name = "a_id")
    private Long aId;

    @ManyToOne
    @JoinColumn(name = "q_id")
    private Questions questions;

    @Column(name = "text")
    private String text;

    @Column(name = "is_right")
    private boolean isRight;

    @Column(name = "pic_src")
    private Long picSrc;

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setIsRight(boolean isRight) {
        this.isRight = isRight;
    }

    public Long getPicSrc() {
        return picSrc;
    }

    public void setPicSrc(Long picSrc) {
        this.picSrc = picSrc;
    }
}
