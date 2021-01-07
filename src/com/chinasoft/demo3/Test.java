package com.chinasoft.demo3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的特点：
    双列集合，元素由键值对构成
    Map<T1,T2> map = new HashMap<>();
    T1是键的数据类型，T2是值得数据类型

    成员方法：
    V put (K key,V value); 添加元素，以键值对得形式
                           元素的第一次添加，返回null
                           重复添加，会用新值覆盖旧值，返回旧值
    V get (Object key);    根据键获取值
    Set<K> keySet();        获取所有键的集合

    遍历的步骤：
               1.获取所有键的集合： keySet()
               2.遍历所有的键，获取到每一个键   迭代器，增强for
               3.根据键，获取值
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer,Student> map = new HashMap<>();
        Student stu1 = new Student("一号",11);
        Student stu2 = new Student("二号",22);
        Student stu3 = new Student("一号",11);
        //V put (K key,V value)
        map.put(1,stu1);
        map.put(2,stu2);
        map.put(3,stu3);
        System.out.println(map);
        System.out.println("*********");

        //根据键，获取值
        Student stu = map.get(3);
        System.out.println("key:"+3+" value:"+stu);
        System.out.println("*********");

        //遍历
        /*
               1.获取所有键的集合： keySet()
               2.遍历所有的键，获取到每一个键   迭代器，增强for
               3.根据键，获取值
         */
        Set<Integer> keys = map.keySet();//键的集合
        //迭代器
//        Iterator<Integer> it = keys.iterator();//迭代器遍历每一个键
//        while(it.hasNext()){
//            Integer key = it.next();//获取键的数据
//            Student value = map.get(key);//根据键获取值的数据
//            System.out.println("key:"+key+"...value:"+value);
//        }

        //增强for
        for (Integer key : keys) {
            //key就是双列集合中的每一个键
            Student value = map.get(key);
            System.out.println("key:"+key+"...value:"+value);
        }
    }
}
