package com.chickenman.question2.spi;


import java.util.Iterator;
import java.util.ServiceLoader;

import com.chickenman.question1.Hello;
import com.chickenman.question2.spi.IService;
import sun.misc.Service;

/**
 * description: spi功能模拟
 * @author 吴瑾
 * @version 1.0
 * @date 2020-10-16 14:55
 */
public class ServiceMain {
	public static void main(String[] args) {
		Iterator<IService> providers = Service.providers(IService.class);
		while (providers.hasNext()){
			providers.next().test();
		}
		System.out.println("==============");
		ServiceLoader<IService> load = ServiceLoader.load(IService.class);
		for (IService iService : load) {
			iService.test();
		}
	}
}
