package com.chickenman.question2.spi.imp;

import com.chickenman.question2.spi.IService;

/**
 * description:
 * @author 吴瑾 
 * @version 1.0
 * @date 2020-10-16 14:52
 */
public class ServiceOneImpl implements IService {
    @Override
    public void test() {
        System.out.println("I am ServiceOneImpl");
    }
}
