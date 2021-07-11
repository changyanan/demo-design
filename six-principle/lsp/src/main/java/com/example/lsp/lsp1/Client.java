package com.example.lsp.lsp1;

public class Client {
    public static void main(String[] args) {
        Soldier sanMao = new Soldier();
        //给三毛一支枪
        sanMao.setGun(new Rifle());
        sanMao.killEnemy();
    }
}
