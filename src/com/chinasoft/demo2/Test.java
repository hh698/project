package com.chinasoft.demo2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(1);
//        list.add("ss");
//        for (Object obj : list) {
//            System.out.println(obj);
//        }
        /*
        1.创建集合对象
        2.创建元素对象
        3.将元素对象添加到集合对象中
        4.遍历集合
         */
        Set<Student> set = new HashSet<>();
        Student stu1 = new Student("yi",11);
        Student stu2 = new Student("er",22);
        Student stu3 = new Student("san",33);
        Student stu4 = new Student("yi",11);
        Student stu5 = new Student("er",22);

        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);

        System.out.println(set);
        System.out.println("------------");

        //迭代器
        /*
        1.通过集合对象获取其对应的迭代器对象
        2.判断迭代器中是否有元素
        3.如果有，就获取元素
         */
        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------");

        //增强for
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
