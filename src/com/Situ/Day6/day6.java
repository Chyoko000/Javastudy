package com.Situ.Day6;

import org.junit.jupiter.api.Test;

public class day6 {
    @Test
    public void test1(){

        String str ="123";//相当于在常量池里面new一个123的字符串
        String str1 =new String("123");//在堆里面new一个123的字符串
        String str2 ="123";//优先使用常量池里面的地址值
        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str2==str);
    }
    @Test
    public void test2() {
        String str = "java AndroidA";
        System.out.println(str.length());//13
        char[] chars = str.toCharArray();
        char ch = str.charAt(5);//A
        System.out.println(ch);
        System.out.println(str.indexOf('A'));//5返回下标
        System.out.println(str.indexOf('X'));//-1 找不到返回-1
        System.out.println(str.indexOf('A', 6));//12，直接从6开始查找
        System.out.println(str.indexOf("And"));//5
        System.out.println(str.lastIndexOf('A'));//12
        //从0开始包括空格
    }


    @Test
    public void test3(){
        String str1="java";
        String str2="Java";
        System.out.println(str1.equals(str2));//equals对比的是内容是否一样

    }
}
