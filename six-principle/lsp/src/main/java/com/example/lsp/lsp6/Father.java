package com.example.lsp.lsp6;

import java.util.ArrayList;
import java.util.HashMap;

public class Father {
    public ArrayList doSomething(HashMap map){
        System.out.println("父类被执行...");
        return new ArrayList();
    }
}
