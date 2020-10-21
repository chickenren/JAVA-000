package com.chickenman.question2.spi.imp;

import com.chickenman.question2.spi.IService;

/**
 * description:
 * @author 吴瑾
 * @version 1.0
 * @date 2020-10-16 14:53
 */
public class ServiceTwoImpl implements IService {
    @Override
    public void test() {
        System.out.println("I am ServiceTwoImpl");
    }
}
