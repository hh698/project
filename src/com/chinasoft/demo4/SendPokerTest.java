package com.chinasoft.demo4;

import java.util.*;

public class SendPokerTest {
    public static void main(String[] args) {
        /*
        双列集合，键表示牌的编号，值表示具体的牌
        单列集合，存储所有的牌的编号
         */
        Map<Integer,String> pokers = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        String[] colors = {"♠","♥","♦","♣"};//创建一个花色的数组
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int num = 0;//表示牌的编号
        //通过循环嵌套创建普通牌
        for (String number : numbers) {//外循环获取所有的点数
            for (String color : colors) {//内循环获取所有的花色
                String poker = color + number;
                //将牌的编号，具体的牌放到双列集合中
                pokers.put(num,poker);
                //将牌的编号放入到单列集合中
                list.add(num);
                //每添加一张牌，编号自增1
                num++;
            }
        }
         //添加大小王
        pokers.put(num,"小王");
        list.add(num++);
        pokers.put(num,"大王");
        list.add(num);

        System.out.println("所有的牌："+pokers);
        System.out.println("牌的编号："+list);
        System.out.println("********************");
        Collections.shuffle(list);
        System.out.println("洗牌后的标号为："+list);
        System.out.println("********************");

        //发牌
        //定义四个集合，代表三个玩家和底牌
        //将索引和3取模，决定发给谁
        //查看玩家，底牌的编号
        List<Integer> xiaoming = new ArrayList<>();
        List<Integer> xiaohong = new ArrayList<>();
        List<Integer> xiaogang = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();

        for (int i = 0;i < list.size();i++){//i表示索引
            //获取编号
            Integer pokerNum = list.get(i);
            if (i >= list.size()-3){
                dipai.add(pokerNum);
            }else if(i % 3 == 0){
                xiaoming.add(pokerNum);
            }else if(i % 3 == 1){
                xiaohong.add(pokerNum);
            }else if(i % 3 == 2){
                xiaogang.add(pokerNum);
            }
        }
        System.out.println("xiaoming:"+xiaoming);
        System.out.println("xiaohong:"+xiaohong);
        System.out.println("xiaogang:"+xiaogang);
        System.out.println("dipai:"+dipai);

        System.out.println("********************");
        System.out.println("xiaoming:"+ printPoker(xiaoming,pokers));
        System.out.println("xiaohong:"+ printPoker(xiaohong,pokers));
        System.out.println("xiaogang:"+ printPoker(xiaogang,pokers));
        System.out.println("dipai:"+ printPoker(dipai,pokers));
    }
    /*
    看牌
    方法名： printPoker
    参数列表：  List<Integer>,Map<Integer,String>
    返回值： String
     */
    public static String printPoker(List<Integer> nums, Map<Integer,String> pokers){//nums是要查看哪些序号的牌
        /*
        1.对牌的编号进行升序排序
        2.遍历牌的集合编号，获取每一个编号
        3.根据编号去双列集合中查找该编号对应的具体牌
        4.将获取到的牌进行拼接
        5.将最后拼接结果返回
         */
        //对牌的编号进行升序排列
        Collections.sort(nums);
        //定义一个对象用于拼接
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            //num就是具体要查找的牌的编号
            String poker = pokers.get(num);
            //对获取到的牌进行拼接
            sb.append(poker + " ");
        }
        String str = sb.toString();
        return str.trim();
    }


}
