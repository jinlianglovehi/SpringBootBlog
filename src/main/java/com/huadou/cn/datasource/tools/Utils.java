package com.huadou.cn.datasource.tools;

/**
 * Created by jinliang on 16-10-14.
 */
public class Utils {


    private static final boolean IS_DEBUG  = true;

    /**
     * 公共的方法打印log 的格式
     */
    public static void printLog(String tag ,String method ,String content){

        if(IS_DEBUG){
            System.out.println("tag:"+ tag + " ---method---"+method +" ,   Content:[   " + content+"  ]");
        }

    }
}
