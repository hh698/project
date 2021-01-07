package com.chinasoft.file3;

import java.io.FileReader;
import java.io.Reader;

/*
    字符流读数据：
        Reader类中的方法：
            int read(); 读一个字符，返回该字符对应的ASCLL码值，读不到返回-1
        FileReader类中的构造方法：
            public FileReader(String pathname); 根据传入的字符串形式的路径，获取字符输入流对象
 */
public class ReaderDemo1 {
    public static void main(String[] args) throws Exception{
        Reader reader = new FileReader("lib/1.txt");//创建字符输入流对象
        //读取数据
//        int ch1 = reader.read();
//        System.out.println(ch1);
        int ch;//定义变量，用来接受读取到的字符
        while((ch = reader.read()) != -1){//读取，赋值，判断
            //ch = reader.read();
            System.out.println(ch);
        }

        reader.close();
    }
}
