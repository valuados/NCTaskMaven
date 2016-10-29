package by.netcracker.stone.dao;

import javax.persistence.*;

/**
 * Created by valua on 10/29/2016.
 */
@Entity
@Table(name = "semiprecious_stone", schema = "stone")
public class SemipreciousStoneEntity {
    private int stoneId;
    private String colourFeatures;

    @Basic
    @Column(name = "STONE_ID")
    public int getStoneId() {
        return stoneId;
    }

    public void setStoneId(int stoneId) {
        this.stoneId = stoneId;
    }

    @Basic
    @Column(name = "COLOUR_FEATURES")
    public String getColourFeatures() {
        return colourFeatures;
    }

    public void setColourFeatures(String colourFeatures) {
        this.colourFeatures = colourFeatures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SemipreciousStoneEntity that = (SemipreciousStoneEntity) o;

        if (stoneId != that.stoneId) return false;
        if (colourFeatures != null ? !colourFeatures.equals(that.colourFeatures) : that.colourFeatures != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stoneId;
        result = 31 * result + (colourFeatures != null ? colourFeatures.hashCode() : 0);
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
