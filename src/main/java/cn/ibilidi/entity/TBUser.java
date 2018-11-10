package cn.ibilidi.entity;

public class TBUser {
    private String id;

    private String name;

    private String openid;

    private String headurl;

    private String gender;

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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        TBUser tbUser=(TBUser)obj;
        return this.id.equals(tbUser.getId());
    }

    public TBUser(String id,String name){
        this.id=id;
        this.name=name;
    }
}