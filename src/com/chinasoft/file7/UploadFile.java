package com.chinasoft.file7;

import java.io.*;
import java.util.Scanner;

public class UploadFile {
    public static void main(String[] args) throws Exception{
        /*
        1.定义一个方法，用来获取要上传的用户头像  getPath（）
        2.定义一个方法，用来判断要上传的用户头像再lib里是否存在
        3.如果存在， 提示用户头像已存在，上传失败
        4.如果不存在，就上传用户头像，并提示上传成功
         */
        File path = getPath();//获取全路径
        System.out.println(path);

        boolean flag = isExists(path.getName());//获取 .jpg
        if (flag){
            System.out.println("已存在");
        }else{
            uploadFile(path);
            System.out.println("上传成功");
        }
    }

    //定义一个方法，用来获取要上传的用户头像的路径
    public static File getPath(){
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("请录入您要上传的头像的路径：");
            String path = sc.nextLine();

            //校验上传的是否是图片
            if (!path.endsWith(".jpg") && !path.endsWith(".png") && !path.endsWith("bmp")){
                System.out.println("上传的不是图片！");
                continue;
            }

            //校验路径是否错误
            File file = new File(path);
            if (file.exists() && file.isFile()){
                return file;
            }else{
                System.out.println("路径错误！");
            }
        }

    }

    //定义一个方法，用来判断要上传的用户头像，在lib文件夹中是否存在
    public static boolean isExists(String path){
        File file = new File("lib");
        String[] names = file.list();
        for (String name : names) {
            if (name.equals(path)){
                return true;
            }
        }
        return false;
    }

    //定义一个方法，用来上传具体的用户头像
    public static void uploadFile(File path) throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/"+path.getName()));
        int len;
        while((len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }

}
