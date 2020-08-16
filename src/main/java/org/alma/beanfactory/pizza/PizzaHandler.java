package org.alma.beanfactory.pizza;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Random;

public class PizzaHandler  implements InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invocation :" + method.getName());
    return new Random().nextInt();
	}
}

