package com.example.lsp.lsp5;

import java.util.Collection;
import java.util.HashMap;

public class Son extends Father{
    //缩小输入参数范围
    public Collection doSomething(HashMap map){
        System.out.println("子类被执行...");
        return map.values();
    }
}
