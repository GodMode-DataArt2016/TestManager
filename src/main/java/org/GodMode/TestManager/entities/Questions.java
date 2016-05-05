package org.GodMode.TestManager.entities;

import org.GodMode.TestManager.entities.utils.QuestionType;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

/**
 * Created by Oleg on 01.05.2016.
 */

@Entity
@Table(name = "Questions")
public class Questions {

    @Id
    @GeneratedValue
    @Column(name = "q_id")
    private Long qId;

    @OneToOne(mappedBy="Tests", fetch = FetchType.EAGER)
    private Tests test;

    @Column
    private  String questionText;

    @Column
    private byte picture;

    @Enumerated(EnumType.STRING)
    @Column
    private QuestionType type;

    public Long getqId() {
        return qId;
    }

    public void setqId(Long qId) {
        this.qId = qId;
    }

    public Tests getTest() {
        return test;
    }

    public void setTest(Tests test) {
        this.test = test;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public byte getPicture() {
        return picture;
    }

    public void setPicture(byte picture) {
        this.picture = picture;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

}