package com.chinasoft.file;
/*
    File类：
        文件，文件夹，一个File对象代表磁盘上得某个文件夹
            就是用来操作文件（夹）路径的

    构造方法：
        File（String pathname）               根据给定的字符串路径创建新的File对象
        File（String parent，String child）   根据给定的字符串形式的父目录和子文件（夹）名创建File对象
        File（File parent，String child）     根据给定的父目录和子文件（夹）名创建File对象

    成员方法：
        创建功能：如果不存在就创建返回true，如果存在就不创建，返回false
            creatNewFile（）： 创建文件
            mkdir（）：        创建单极目录
            mkdirs（）：       创建目录
        判断功能：
            isDirectory（）：  判断File对象是否为目录
            isFile（）：       判断File对象是否为文件
            exists（）：       判断Fiel对象是否存在

 */

import java.io.File;

public class Test {
    public static void main(String[] args) throws Exception{
//        System.out.println("hhh");
        //构造方法一:字符串形式的路径获取File对象
        File file1 = new File("D:/abc/1.txt");
        System.out.println(file1);

        //构造方法二：字符串形式的父目录和子目录创建File对象
        File file2 = new File("D:/abc/","1.txt");
        System.out.println(file2);

        //构造方法三：父目录对象和字符转形式的子目录
        File file3 = new File("D:/abc/");
        File file4 =new File(file3,"1.txt");
        System.out.println(file4);

        System.out.println("**********************");

        //成员方法的创建功能
        File file5 = new File("d:/abc/2.txt");
        boolean flag1 = file5.createNewFile();
        System.out.println(flag1);
//        System.out.println(file5);

        //创建文件夹 单级目录
        File file6 = new File("d:/abd");
        boolean flag2 = file6.mkdir();
        System.out.println(flag2);

        //多级目录
        File file7 = new File("d:/abc/a/b");
        boolean flag3 = file7.mkdirs();
        System.out.println(flag3);

        System.out.println("******************");
        //成员方法的判断功能
        File file8 = new File("d:/abc/a");
        System.out.println(file8.isDirectory());
        System.out.println(file8.isFile());
        System.out.println(file8.exists());

    }
}
