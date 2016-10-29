package by.netcracker.stone.dao;

import javax.persistence.*;

/**
 * Created by valua on 10/29/2016.
 */
@Entity
@Table(name = "stone", schema = "stone")
public class StoneEntity {
    private int stoneId;
    private String stoneName;
    private double stoneCarat;
    private double stonePrice;
    private String stoneColour;
    private double stoneSolidity;
    private double stoneDencity;
    private String stoneType;

    @Id
    @Column(name = "STONE_ID")
    public int getStoneId() {
        return stoneId;
    }

    public void setStoneId(int stoneId) {
        this.stoneId = stoneId;
    }

    @Basic
    @Column(name = "STONE_NAME")
    public String getStoneName() {
        return stoneName;
    }

    public void setStoneName(String stoneName) {
        this.stoneName = stoneName;
    }

    @Basic
    @Column(name = "STONE_CARAT")
    public double getStoneCarat() {
        return stoneCarat;
    }

    public void setStoneCarat(double stoneCarat) {
        this.stoneCarat = stoneCarat;
    }

    @Basic
    @Column(name = "STONE_PRICE")
    public double getStonePrice() {
        return stonePrice;
    }

    public void setStonePrice(double stonePrice) {
        this.stonePrice = stonePrice;
    }

    @Basic
    @Column(name = "STONE_COLOUR")
    public String getStoneColour() {
        return stoneColour;
    }

    public void setStoneColour(String stoneColour) {
        this.stoneColour = stoneColour;
    }

    @Basic
    @Column(name = "STONE_SOLIDITY")
    public double getStoneSolidity() {
        return stoneSolidity;
    }

    public void setStoneSolidity(double stoneSolidity) {
        this.stoneSolidity = stoneSolidity;
    }

    @Basic
    @Column(name = "STONE_DENCITY")
    public double getStoneDencity() {
        return stoneDencity;
    }

    public void setStoneDencity(double stoneDencity) {
        this.stoneDencity = stoneDencity;
    }

    @Basic
    @Column(name = "STONE_TYPE")
    public String getStoneType() {
        return stoneType;
    }

    public void setStoneType(String stoneType) {
        this.stoneType = stoneType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoneEntity that = (StoneEntity) o;

        if (stoneId != that.stoneId) return false;
        if (Double.compare(that.stoneCarat, stoneCarat) != 0) return false;
        if (Double.compare(that.stonePrice, stonePrice) != 0) return false;
        if (Double.compare(that.stoneSolidity, stoneSolidity) != 0) return false;
        if (Double.compare(that.stoneDencity, stoneDencity) != 0) return false;
        if (stoneName != null ? !stoneName.equals(that.stoneName) : that.stoneName != null) return false;
        if (stoneColour != null ? !stoneColour.equals(that.stoneColour) : that.stoneColour != null) return false;
        if (stoneType != null ? !stoneType.equals(that.stoneType) : that.stoneType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = stoneId;
        result = 31 * result + (stoneName != null ? stoneName.hashCode() : 0);
        temp = Double.doubleToLongBits(stoneCarat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(stonePrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (stoneColour != null ? stoneColour.hashCode() : 0);
        temp = Double.doubleToLongBits(stoneSolidity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(stoneDencity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (stoneType != null ? stoneType.hashCode() : 0);
        return result;
    }
}
