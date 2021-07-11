package com.example.srp.srp1;

public class Client {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserID("1");
        userInfo.deleteUser();
    }
}
