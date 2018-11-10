package cn.ibilidi.entity;

public class TBJs {
    private String jsh;

    private String jsxm;

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

    @Override
    public boolean equals(Object obj) {
        TBJs tbJs=(TBJs)obj;
        return this.getJsh().equals(tbJs.getJsh());
    }
}