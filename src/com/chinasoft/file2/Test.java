package com.chinasoft.file2;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file1 = new File("lib/1.txt");

        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println("***********");
        File file2 = new File("lib");
        String[] names = file2.list();
        for (String name : names) {
            System.out.println(name);
        }
        File[] files = file2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
