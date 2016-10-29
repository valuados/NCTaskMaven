package by.netcracker.stone.dao;

import javax.persistence.*;

/**
 * Created by valua on 10/29/2016.
 */
@Entity
@Table(name = "precious_stone", schema = "stone")
public class PreciousStoneEntity {
    private int stoneId;
    private String syngony;

    @Basic
    @Column(name = "STONE_ID")
    public int getStoneId() {
        return stoneId;
    }

    public void setStoneId(int stoneId) {
        this.stoneId = stoneId;
    }

    @Basic
    @Column(name = "SYNGONY")
    public String getSyngony() {
        return syngony;
    }

    public void setSyngony(String syngony) {
        this.syngony = syngony;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PreciousStoneEntity that = (PreciousStoneEntity) o;

        if (stoneId != that.stoneId) return false;
        if (syngony != null ? !syngony.equals(that.syngony) : that.syngony != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stoneId;
        result = 31 * result + (syngony != null ? syngony.hashCode() : 0);
        return result;
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
