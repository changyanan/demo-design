package com.example.srp.srp3;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.dial("拨号");
        phone.hangup();
        IConnectionManager iConnectionManager = new ConnectionManager();
        phone.chat(iConnectionManager);

        Phone1 phone1 = new Phone1();
        phone1.cm.dial("拨号");

        phone1.cm.hangup();
        phone1.dt.chat(iConnectionManager);

    }
}
