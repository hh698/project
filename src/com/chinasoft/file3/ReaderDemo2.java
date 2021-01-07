package com.chinasoft.file3;

import java.io.FileReader;
import java.io.Reader;

/*
    字符流读取数据
        Reader中的方法：
            int read(char[] chs); 一次读一个字符数组，将读取到的内容存入数组中
                                  并返回读取到的有效字符数，读不到返回-1
        FileReader类中的构造方法：
            public FileReader(String pathname); 根据传入的字符串形式的路径，获取字符输入流对象
 */
public class ReaderDemo2 {
    public static void main(String[] args) throws Exception{
        //创建字符输入流对象
        Reader reader = new FileReader("lib/2.txt");
        //读取数据
//        char[] chs = new char[3];
//        int len1 = reader.read(chs);
//        System.out.println(chs);
//        System.out.println(len1);
        //定义字符数组
        char[] chs = new char[3];
        //定义一个变量，记录读取到的有效字符数
        int len;
        while ((len = reader.read(chs)) != -1){
            //将读取到的内容转换成字符串然后打印
            String  s = new String(chs,0,len);
            System.out.println(s);
        }
        //释放资源
        reader.close();
    }
}
