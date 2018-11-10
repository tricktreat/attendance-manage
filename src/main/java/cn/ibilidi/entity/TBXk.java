package cn.ibilidi.entity;

public class TBXk extends TBXkKey {
    private String name;

    private String kcmc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc;
    }

    @Override
    public boolean equals(Object obj) {
        TBXk tbXk=(TBXk)obj;
        return this.getId().equals(tbXk.getId())&&this.getKch().equals(tbXk.getKch());
    }
}