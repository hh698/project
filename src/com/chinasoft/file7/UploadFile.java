package com.chinasoft.file7;

import java.io.File;
import java.util.Scanner;

public class UploadFile {
    public static void main(String[] args) {
        /*
        1.定义一个方法，用来获取要上传的用户投降  getPath（）
        2.定义一个方法，用来判断要上传的用户头像再lib里是否存在
        3.如果存在， 提示用户头像已存在，上传失败
        4.如果不存在，就上传用户头像，并提示上传成功
         */
        File path = getPath();
        System.out.println(path);

    }
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

            //校验是否是图片
            File file = new File(path);
            if (file.exists() && file.isFile()){
                return file;
            }else{
                System.out.println("路径错误！");
            }
        }

    }

}
