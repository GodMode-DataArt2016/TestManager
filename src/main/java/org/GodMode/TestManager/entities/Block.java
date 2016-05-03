package org.GodMode.TestManager.entities;

import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity
@Table(name = "Block")
public class Block {

    @Id
    @GeneratedValue
    @Column(name = "b_id")
    private Long bId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "TestsBlocks")
    private Set testsBlocks;

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set getTestsBlocks() {
        return testsBlocks;
    }

    public void setTestsBlocks(Set testsBlocks) {
        this.testsBlocks = testsBlocks;
    }
}
