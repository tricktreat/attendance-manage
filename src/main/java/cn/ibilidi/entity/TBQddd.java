package cn.ibilidi.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TBQddd {
    private Integer id;

    private String kch;

    private Date sj;

    private BigDecimal lat;

    private BigDecimal lng;

    private Integer dis;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKch() {
        return kch;
    }

    public void setKch(String kch) {
        this.kch = kch;
    }

    public Date getSj() {
        return sj;
    }

    public void setSj(Date sj) {
        this.sj = sj;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public Integer getDis() {
        return dis;
    }

    public void setDis(Integer dis) {
        this.dis = dis;
    }
}