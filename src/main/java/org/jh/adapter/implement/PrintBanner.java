package org.jh.adapter.implement;

/**
 * Adapter 适配器
 *
 * @author hjh
 * @version 1.0
 * @date 2020/9/2 0:39
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
