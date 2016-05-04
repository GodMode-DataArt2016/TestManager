package org.GodMode.TestManager.entities;

import javax.persistence.*;

/**
 * Created by Oleg on 01.05.2016.
 */
@Entity
@Table(name = "TestsBlocks")
public class TestsBlocks {

    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "tb_id")
    private long tbId;

    @ManyToOne
    @JoinColumn(name = "t_id")
    private Tests tests;

    @ManyToOne
    @JoinColumn(name = "b_id")
    private Block block;

    public TestsBlocks() {}

    public long getTbId() {
        return tbId;
    }

    public void setTbId(long tbId) {
        this.tbId = tbId;
    }

    public Tests getTests() {
        return tests;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }
}
