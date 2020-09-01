package org.jh.adapter.implement;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/9/2 0:41
 */
public class Main {
    public static void main(String[] args) {
        // 使用继承的适配器
        Print print = new PrintBanner("类适配器模式");
        print.printWeak();
        print.printStrong();
    }
}
