package com.example.srp.srp3;

public class ConnectionManager implements IConnectionManager{
    @Override
    public void dial(String phoneNumber) {
        System.out.println("拨号");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
