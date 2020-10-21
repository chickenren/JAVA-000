package com.chickenman.question1;


/**
 * description:
 * @author 吴瑾
 * @version 1.0
 * @date 2020-10-15 23:34
 */
public class Hello {
    private final static int FINAL_STATIC = 1;
    public final static int FINAL_STATIC2 =2;
    private static int ONLY_STATIC = 5;
    public static int b=6;

    public static void main(String[] args) {
        int a = 10;
        int b = 210;
        int c;
        for (int i = 0; i < ONLY_STATIC; i++) {
            a++;
        }
        //c=a+b+FINAL_STATIC2;
        ONLY_STATIC = a;
        System.out.println(FINAL_STATIC + ONLY_STATIC);
        String str = "HELLO";
        System.out.println(str);
    }
}
