package com.chinasoft.file6;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
字节流的用法：
    FileInputStream：普通的字节输入流，用来读取数据
        成员方法：
            public int read(byte[] bys);一次读取一个字节数组，将读取到的内容存入数组中，并返回读取到的有效字节数，读不到返回-1

    FileOutputStream：普通的字节输出流，用来写数据
        成员方法：
            public void write(byte[] bys,int index,int len);一次写入一个指定的字节数组

 */
public class CopyFile2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("lib/a.jpg");
        FileOutputStream fos = new FileOutputStream("lib/c.jpg");
        //定义变量，用来接收读取到的内容
        byte[] bys = new byte[1024];
        int len;

        while ((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }

        fis.close();
        fos.close();
    }
}
