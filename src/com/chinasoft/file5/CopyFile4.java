package com.chinasoft.file5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
字符缓冲流用法：
    分类：
        BufferedReader：字符缓冲输入流（高效字符输入流）
            成员方法：
                 public String readLine(); 一次读取一行数据并返回读取到的内容，读不到返回null

        BufferedWriter：字符缓冲输出流（高效字符输出流）
            成员方法：
                pubnlic void newLine(); 根据当前操作系统给出对应的换行符

     特点：
        字符缓冲流自带缓冲区，大小为8192个字符，就是16KB
 */
public class CopyFile4 {
    public static void main(String[] args) throws  Exception{
        //创建字符缓冲输入流，关联数据源文件
        BufferedReader br = new BufferedReader(new FileReader("lib/4.txt"));
        //创建字符缓冲输出流，关联数据源文件
        BufferedWriter bw= new BufferedWriter(new FileWriter("lib/5.txt"));

        //定义一个变量，记录读取到的内容  String类型的变量
        String str;

        while ((str = br.readLine()) != null){
            bw.write(str);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
