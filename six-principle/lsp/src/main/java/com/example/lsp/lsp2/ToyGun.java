package com.example.lsp.lsp2;

/**
 * 玩具枪
 */
public class ToyGun extends AbstractGun {
    //玩具枪式不能射击的，但是编译器又要求实现这个方法，怎么办？虚假一个呗！
    @Override
    public void shoot() {
        //玩具枪不能射击，这个方法就不能实现了
        //如果子类不能完整地实现父类的方法，或者父类的某些方法在子类中已经发生畸变，则建议断开父类继承关系，采用，依赖、聚集、组合灯关系替代继承
    }
}
