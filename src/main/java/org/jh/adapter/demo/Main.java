package org.jh.adapter.demo;

import java.io.IOException;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/9/2 0:59
 */
public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("year", "2020");
            fileIO.setValue("month", "09");
            fileIO.setValue("day", "02");
            fileIO.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
