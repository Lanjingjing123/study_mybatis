package com.csii.ljj.pojo;

public class Users {
    private Integer userid1;
    private String userName1;
    private Integer userage1;

    public Integer getUserid1() {
        return userid1;
    }

    public void setUserid1(Integer userid1) {
        this.userid1 = userid1;
    }

    public String getUserName1() {
        return userName1;
    }

    public void setUserName1(String userName1) {
        this.userName1 = userName1;
    }

    public Integer getUserage1() {
        return userage1;
    }

    public void setUserage1(Integer userage1) {
        this.userage1 = userage1;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid1=" + userid1 +
                ", userName1='" + userName1 + '\'' +
                ", userage1=" + userage1 +
                '}';
    }
}
