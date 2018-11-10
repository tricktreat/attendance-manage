package cn.ibilidi.entity;

public class TBKc {
    private String kch;

    private String kcmc;

    private String jsh;

    private String jsxm;

    private String sksj;

    private String skdd;

    private Integer allowornot;

    public String getKch() {
        return kch;
    }

    public void setKch(String kch) {
        this.kch = kch;
    }

    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc;
    }

    public String getJsh() {
        return jsh;
    }

    public void setJsh(String jsh) {
        this.jsh = jsh;
    }

    public String getJsxm() {
        return jsxm;
    }

    public void setJsxm(String jsxm) {
        this.jsxm = jsxm;
    }

    public String getSksj() {
        return sksj;
    }

    public void setSksj(String sksj) {
        this.sksj = sksj;
    }

    public String getSkdd() {
        return skdd;
    }

    public void setSkdd(String skdd) {
        this.skdd = skdd;
    }

    public Integer getAllowornot() {
        return allowornot;
    }

    public void setAllowornot(Integer allowornot) {
        this.allowornot = allowornot;
    }

    @Override
    public boolean equals(Object obj) {
        TBKc tbKc=(TBKc)obj;
        return tbKc.getKch().equals(this.getKch());
    }
}