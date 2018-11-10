package cn.ibilidi.entity;

import org.springframework.util.StringUtils;

public class TBXs {
    private String id;

    private String name;

    private String zy;

    private String bj;

    private String nj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    public String getNj() {
        return nj;
    }

    public void setNj(String nj) {
        this.nj = nj;
    }

    @Override
    public boolean equals(Object obj) {
        TBXs tbXs=(TBXs)obj;
        return this.getId().equals(tbXs.getId());
    }
}