package org.jh.adapter.demo;

import java.io.IOException;

/**
 * Target
 *
 * @author hjh
 * @version 1.0
 * @date 2020/9/2 0:51
 */
public interface FileIO {
    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
