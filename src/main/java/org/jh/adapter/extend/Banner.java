package org.jh.adapter.extend;

/**
 * Adaptee 100伏电源
 *
 * @author hjh
 * @version 1.0
 * @date 2020/9/2 0:35
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
