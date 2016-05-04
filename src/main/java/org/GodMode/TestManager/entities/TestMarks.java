package org.GodMode.TestManager.entities;

import javax.persistence.*;

@Entity
@Table(name = "TestMarks")
public class TestMarks {

    @Id
    @GeneratedValue
    @Column(name = "tm_id")
    private Long tmId;

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

}