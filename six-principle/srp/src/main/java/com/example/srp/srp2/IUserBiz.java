package com.example.srp.srp2;

public interface IUserBiz {
    boolean changePassword(String oldPassword);

    boolean deleteUser();

    void mapUser();

    void addOrg(IUserBO userBO, int orgID);

    void addRole(IUserBO userBO, int roleID);
}
