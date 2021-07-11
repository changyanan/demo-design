package com.example.lsp.lsp7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void invoker(){
        //父类存在的地方，子类就应该能够存在
//        Father f = new Father();
        Son f =new Son();
        Map map = new HashMap();
        Collection arrayList = f.doSomething((HashMap) map);
    }

    public static void main(String[] args) {

        invoker();
    }
}
