package com.csii.ljj.pojo;

public class Users {
    private Integer userid;
    private String userName;
    private Integer userage;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", userage=" + userage +
                '}';
    }
}
