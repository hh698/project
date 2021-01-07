package com.chinasoft.file6;
//拷贝纯文本文件用字符流，拷贝其他（文本，音频，视频等）用字节流
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile3 {
    public static void main(String[] args) throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/a.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/d.jpg"));

        int len;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }

        bis.close();
        bos.close();
    }
}
