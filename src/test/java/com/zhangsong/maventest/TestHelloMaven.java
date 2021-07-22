package com.zhangsong.maventest;

import org.junit.Assert;
import org.junit.Test;

/**
 * created by on 2021/7/22
 * 描述：Maven——单元测试类
 *
 * @author ZSAndroid
 * @create 2021-07-22-12:13
 */
public class TestHelloMaven {
    @Test
    public void testAdd() {
        HelloMaven helloMaven = new HelloMaven();
        int testAddValue = helloMaven.add(100, 200);
        //验证100+200是不是300 ,junit提供的方法，对比结果的
        //assertEquals(期望值，实际值)，如果两个值相等证明是正确的，不相等就抛出异常==等于==错误
        Assert.assertEquals(300, testAddValue);
    }
}
