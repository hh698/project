package com.chinasoft.file4;

import java.io.FileWriter;
import java.io.Writer;

/*
    字符流写数据
        Writer中的方法：
            void write(int ch);                         一次写一个字符
            void write(char[] chs,int index,int len);   一次写一个指定的字符数组
            void write(String str);                     一次写一个字符串
     FileWriter类的构造方法：
        public FileWriter(String pathname); 根据传入的字符串形式的路径，获取字符流输出对象
 */
public class WriterDemo {
    public static void main(String[] args) throws Exception{
        //创建字符输出流对象
        Writer writer = new FileWriter("lib/1.txt");
        //写数据
        //一次写一个字符
        //writer.write("");
        //一次写一个字符数组
//        char[] chs = {'啊','从','是','我'};
//        writer.write(chs);
        //一次写一个字符串
        writer.write("哈哈哈哈哈");

        //释放资源
        writer.close();
    }
}
