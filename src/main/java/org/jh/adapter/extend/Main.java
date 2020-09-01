package org.jh.adapter.extend;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/9/2 0:41
 */
public class Main {
    public static void main(String[] args) {
        // 使用委托的适配器
        Print print = new PrintBanner("对象适配器模式");
        print.printWeak();
        print.printStrong();
    }
}
