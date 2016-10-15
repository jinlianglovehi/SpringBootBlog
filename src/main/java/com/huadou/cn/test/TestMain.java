package com.huadou.cn.test;

/**
 * Created by jinliang on 16-10-14.
 */
public class TestMain {

    private static final int  EventFlagSilent= (1 << 0) ;  //1

    private static final int  EventFlagImportant= (1 << 1) ; //2

    private static final int  EventFlagPreExisting= (1 << 2) ; //4

    private static final int  EventFlagPositiveAction= (1 << 3) ; // 8

    private static final int  EventFlagNegativeAction= (1 << 4) ;// 16
     public static void main(String args[]) {

         System.out.println(EventFlagSilent);
         System.out.println(EventFlagImportant);
         System.out.println(EventFlagPreExisting);
         System.out.println(EventFlagPositiveAction);
         System.out.println(EventFlagNegativeAction);

     }



}
