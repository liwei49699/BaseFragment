package com.chengzhen.jarlib;

public class StringUtils {

    /**
     * 字符串判空
     * @param msg 字符串
     * @return 是否为空
     */
    public static boolean judgeEmpty(String msg){

        return msg == null || msg.trim().length() == 0;
    }
}
