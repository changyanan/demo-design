package com.example.srp.srp2;

public class UserInfo implements IUserInfo {
    private String userName;
    private String userID;
    private String password;

    @Override
    public void setUserID(String userID) {
        this.userID=userID;
    }

    @Override
    public String getUserID() {
        return userID;
    }

    @Override
    public void setPassword(String password) {
        this.password=password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setUserName(String userName) {
        this.userName =userName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public boolean changePassword(String oldPassword) {
        System.out.println("修改密码");
        return false;
    }

    @Override
    public boolean deleteUser() {
        System.out.println("删除用户");
        return false;
    }

    @Override
    public void mapUser() {
        System.out.println("mapUser");
    }

    @Override
    public void addOrg(IUserBO userBO, int orgID) {
        System.out.println("test");
    }

    @Override
    public void addRole(IUserBO userBO, int roleID) {
        System.out.println("test");
    }
}
