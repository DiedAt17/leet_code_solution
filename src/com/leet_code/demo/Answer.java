package com.leet_code.demo;


import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Answer {

    public static void main(String[] args) {
        ListNode l1 = new ListNode( 2 );
        ListNode listNode2 = new ListNode( 4 );
        ListNode listNode3 = new ListNode( 3 );
        l1.setNext( listNode2 );
        listNode2.setNext( listNode3 );

        ListNode l2 = new ListNode( 5 );
        ListNode listNode4 = new ListNode( 6 );
        ListNode listNode5 = new ListNode( 4 );
        l2.setNext( listNode4 );
        listNode4.setNext( listNode5 );

        String num1 = "";
        while (l1 != null){
            num1 = String.valueOf( l1.getVal() ) + num1;

            l1 = l1.next;
        }



        String num2 = "";
        while (l2 != null){
            num2 = String.valueOf( l2.getVal() ) + num2;
            l2 = l2.next;
        }

        ListNode first=new ListNode(0);

        BigDecimal bigNum = new BigDecimal(num1);
        bigNum = bigNum.add(new BigDecimal(num2));
        String num = bigNum.toString();

        first.val = Integer.valueOf(num.charAt( 0 )-'0');
        for (int i = 1; i < num.length(); i++) {
            ListNode next = new ListNode(Integer.valueOf(num.charAt( i )-'0'));
            next.next = first;
            first = next;
        }
        System.out.println(first);
    }
}
