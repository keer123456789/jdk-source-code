package com.keer.java.lang;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: 张经伦
 * @Date: 2022/10/9  15:06
 * @Description:
 */
public class StringTest {
    @Test
    public void toUpperCase(){
        String str="hello,jack!";
        String upperCase = str.toUpperCase();
        Assert.assertTrue("HELLO,JACK!".equals(upperCase));
    }
}
