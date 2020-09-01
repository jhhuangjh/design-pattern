package org.jh.adapter.extend;

/**
 * Adapter 适配器
 *
 * @author hjh
 * @version 1.0
 * @date 2020/9/2 0:39
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
