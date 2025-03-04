package com.blackdui.hashMap;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        String[] number = "2-3-4-5-6-7-8-9-10-J-Q-K-A".split("-");
        String[] color = "黑桃-红桃-方块-梅花".split("-");
        HashMap<Integer, String> poker = new HashMap<>();
        //int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        int i = 2;
        for (String num :
                number) {
            for (String pcolor :
                    color) {
                poker.put(i, pcolor + num);
                list.add(i);
                i++;
            }
        }

        poker.put(0, "大王");
        poker.put(1, "小王");

//        System.out.println(list);
//        System.out.println(poker);

//        Set<Integer> set = poker.keySet();
//
//        Iterator<Integer> iterator = set.iterator();
//        for (Integer i1 :
//                set) {
//            list.add(i1);
//        }//牌的索引

        Collections.shuffle(list);

        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> holeCard = new ArrayList<>();

        for (int i2 = 0;i2 < list.size();i2++) {
            Integer i3 = list.get(i2);
            if (i2 >= 51) {
                holeCard.add(i2);
            } else if (i2 % 3 == 0) {
                p1.add(i3);
            } else if (i2 % 3 == 1) {
                p2.add(i3);
            } else if (i2 % 3 == 2) {
                p3.add(i3);
            }
        }//发牌

        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(holeCard);//排序

        findpoker("marisa", p1, poker);
        findpoker("marisa1", p2, poker);
        findpoker("marisa2", p3, poker);
        findpoker("marisa3", holeCard, poker);


    }

    private static void findpoker(String name, ArrayList<Integer> list, HashMap<Integer, String> map) {
        System.out.println("name:" + name);

        for (Integer i :
                list) {
            String value = map.get(i);
            System.out.print(value + " ");
        }
        System.out.println();

    }
}
