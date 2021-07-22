package com.zhangsong.maventest;

/**
 * created by on 2021/7/22
 * 描述：Manven——单元测试类
 *
 * @author ZSAndroid
 * @create 2021-07-22-12:07
 */
public class HelloMaven {
    public static void main(String[] args) {
        HelloMaven helloMaven = new HelloMaven();
        int addValue = helloMaven.add(100, 200);
        System.out.println("100+200计算结果=" + addValue);
    }

    /**
     * 计算两个整数之和的方法
     * @param a 第一个数
     * @param b 第一个数
     * @return
     */
    public int add(int a, int b) {
        return a + b;
    }
}
