package org.GodMode.TestManager.entities;

import javax.persistence.*;

/**
 * Created by Oleg on 01.05.2016.
 */
@Entity
@Table(name = "testsblocks")
public class TestsBlocks {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "tb_id")
    private Long tbId;

    @ManyToOne
    @JoinColumn(name = "t_id")
    private Tests tests;

    @ManyToOne
    @JoinColumn(name = "b_id")
    private Block block;

    public TestsBlocks() {}

    public Long getTbId() {
        return tbId;
    }

    public void setTbId(Long tbId) {
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
