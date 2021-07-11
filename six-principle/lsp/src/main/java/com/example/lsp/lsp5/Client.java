package com.example.lsp.lsp5;

import java.util.HashMap;

public class Client {
    public static void invoker(){
        //有父类的地方就有子类
//        Father f= new Father();
        Son f =new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {
        invoker();
        //子类没有覆盖父类方法的前提下，子类就被执行了，这就会引起业务逻辑的混乱，因为在实际应用中父类一般是抽象类，子类是实现类，
        //你传递的一个这样的实现类就会歪曲了父类的意图，引起意想不到的业务逻辑混乱，
        // 所以子类中方法的前提条件必须与超类中被覆盖的方法的前置条件相同或者更宽松
    }
}
