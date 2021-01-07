package com.chinasoft.file5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
1.创建字符缓冲输入流对象，关联数据源文件
2.创建字符缓冲输出流对象，关联数据源文件
3.定义一个变量，记录读取到的数据
4.循环读取，只要条件满足就一直读取，并将读取到的内容赋值给变量
5.将读取到的数据写入到目的地文件中
6.释放资源
 */
public class CopyFile3 {
    public static void main(String[] args) throws Exception{
         /*
         创建普通的字符输入流对象
         创建字符缓冲输入流对象
          */
        FileReader fr = new FileReader("lib/1.txt");
        BufferedReader br = new BufferedReader(fr);
        //BufferedReader br = new BufferedReader(new FileReader("lib/1.txt"));

        FileWriter fw = new FileWriter("lib/2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        //BufferedWriter bw =new BufferedWriter(new FileWriter("lib/2.txt");

        int len;
        while((len = br.read()) != -1){
            bw.write(len);
        }

//        fr.close();
//        fw.close();
        br.close();
        bw.close();

    }
}
