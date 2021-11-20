package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;

public class TemplatesTest {
    //模板6 prsf:可生成private static final
    private static final String a = "mm";
    //模板七 psf psfi psfs
    public static final int m = 12;
    public static final int n = 13;
    public static final String mx = "mm";


    /*IDEA 中代码模板所处的位置：setting - Editor -Live Templates / postfix completion
     * 2.常用的模板*/
//    模板一psvm
    public static void main(String[] args) {
//    模板二：sout
        System.out.println();
        //输出方法的形参 soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //输出方法的名字 soutm
        System.out.println("TemplatesTest.main");
        //输出变量 soutv
        System.out.println("args = " + args);
        int num = 11;
        System.out.println("num = " + num);
        System.out.println(num);
        //模板三 fori
        Object o;
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            o = s;
            System.out.println(o);
        }
        //模板四list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);
        list.add("aaa");
        //list.for
        for (Object o1 : list) {
            o = o1;
            System.out.println(o);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //模板五：ifnY
        if (list == null) {

        }



    }
    public void tesstupdate(){
        System.out.println();
    }

}
