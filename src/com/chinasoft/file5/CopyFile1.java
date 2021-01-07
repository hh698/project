package com.chinasoft.file5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

//通过字符流拷贝文件，一次读写一个字符
/*
IO流拷贝文件核心6步
1.创建字符输入流对象，关联数据源文件
2.创建字符输出流对象，关联数据源文件
3.定义变量，记录读取到的数据
4.循环读取，只要条件满足就一直读取，并将读取到的内容赋值给变量
5.将读取到的数据写入到目的地文件中
6.释放资源
 */
public class CopyFile1 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("lib/1.txt");
        FileWriter fw = new FileWriter("lib/2.txt");

        int len; //len里面就是读取到的数据
        while ((len = fr.read()) != -1){
            fw.write(len);
        }

        fr.close();
        fw.close();
    }
}
