package org.GodMode.TestManager.entities;

import org.GodMode.TestManager.entities.utils.QuestionType;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

/**
 * Created by Oleg on 01.05.2016.
 */

@Entity
@Table(name = "questions")
public class Questions {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "q_id")
    private Long qId;

    @ManyToOne
    @JoinColumn(name = "t_id")
    private Tests tests;

    @Column(name = "q_text")
    private  String qText;

    @Column(name = "pic_src")
    private Byte picSrc;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private QuestionType type;

    public Long getqId() {
        return qId;
    }

    public void setqId(Long qId) {
        this.qId = qId;
    }

    public Tests getTests() {
        return tests;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public Byte getPicSrc() {
        return picSrc;
    }

    public void setPicSrc(Byte picSrc) {
        this.picSrc = picSrc;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

}