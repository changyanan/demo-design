package com.example.srp.srp2;

public class Client {
    public static void main(String[] args) {
        IUserBiz userInfo = new UserInfo();
        //赋值
        IUserBO userBO = (IUserBO) userInfo;
        userBO.setPassword("abc");
        //执行动作
        IUserBiz userBiz = userInfo;
        userBiz.addOrg(userBO, 0);
    }

}
