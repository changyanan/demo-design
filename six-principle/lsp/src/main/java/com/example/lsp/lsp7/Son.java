package com.example.lsp.lsp7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Son extends Father {
    public ArrayList doSomething(Map map) {
        System.out.println("子类被执行...");
        return new ArrayList();
    }
}
