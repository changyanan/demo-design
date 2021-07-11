package com.example.srp.srp3;

public class Phone implements IConnectionManager,IDataTransfer {

    @Override
    public void dial(String phoneNumber) {
        System.out.println("拨号");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }

    @Override
    public void chat(IConnectionManager cm) {
        cm.dial("110");
        System.out.println("通话");
        cm.hangup();
    }
}
