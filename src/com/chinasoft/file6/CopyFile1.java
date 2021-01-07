package com.chinasoft.file6;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
字节流的用法：
    FileInputStream：普通的字节输入流，用来读取数据
        构造方法：
            public FileInputStream(String pathname);
        成员方法：
            public int read();一次读取一个字节，并返回读取到的内容，读不到返回-1

    FileOutputStream：普通的字节输出流，用来写数据
        构造方法：
            public FileOutputStream(String pathname);
        成员方法：
            public void write(int len);一次写入一个字节

 */
public class CopyFile1 {
    public static void main(String[] args) throws Exception{
        //创建字节输入流，关联数据源文件
        FileInputStream fis = new FileInputStream("lib/a.jpg");
        //创建字节输出流，关联数据源文件
        FileOutputStream fos = new FileOutputStream("lib/b.jpg");

        int len;
        while ((len = fis.read()) != -1){
            fos.write(len);
        }

        fis.close();
        fos.close();
    }
}
