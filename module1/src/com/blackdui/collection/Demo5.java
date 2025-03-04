package com.blackdui.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Demo5 {
    public static void main(String[] args) {
        //花色
//        ArrayList<String> color = new ArrayList<>();
//        color.add("黑桃");
//        color.add("红桃");
//        color.add("方块");
//        color.add("梅花");

        String[] color = "黑桃-红桃-方块-梅花".split("-");

        //数字
//        ArrayList<String> number = new ArrayList<>();
//        for (int i = 2; i <= 10 ; i++) {
//            number.add(i + "");
//        }
//
//        number.add("J");
//        number.add("Q");
//        number.add("K");
//        number.add("A");

        String[] number = "2-3-4-5-6-7-8-9-10-J-Q-K-A".split("-");

        //扑克
        ArrayList<String> poker = new ArrayList<>();
        for (String newcolor:
             color) {
            for (String num:
                 number) {
                String pokerNum = num + newcolor;
                poker.add(pokerNum);
            }
        }
        poker.add("大王");
        poker.add("小王");


        //打乱
        Collections.shuffle(poker);
        
        //三个玩家和底牌

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> holeCard = new ArrayList<>();

        for(int i = 0;i < poker.size();i++){
            String s =  poker.get(i);
            if (i >= 51){
                holeCard.add(s);
            } else if (i % 3 == 0) {
                p1.add(s);
            } else if (i % 3 == 1) {
                p2.add(s);
            } else if (i % 3 == 2){
                p3.add(s);
            }
        }

        //遍历
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(holeCard);


    }
}
