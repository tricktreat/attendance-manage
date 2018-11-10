package cn.ibilidi.entity;

public class TBGlkc {
    private Integer id;

    private String kch;

    private String xh;

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

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    @Override
    public boolean equals(Object obj) {
        TBGlkc tbGlkc=(TBGlkc)obj;
        return tbGlkc.getKch().equals(this.getKch())&&tbGlkc.getXh().equals(this.getXh());
    }
}