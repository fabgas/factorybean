package org.alma.beanfactory;

import org.alma.beanfactory.pizza.CheesePizza;
import org.alma.beanfactory.pizza.ChickenPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseService {
	@Autowired
	ServiceI service;
	@Autowired
	CheesePizza pizza;
	@Autowired
	ChickenPizza chickenpizza;
	public void hello() {
		pizza.findByChicken();
		chickenpizza.findByIngredient();
	}
}
