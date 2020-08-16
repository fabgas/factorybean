package org.alma.beanfactory.pizza;

import org.alma.beanfactory.annotation.Pizza;
import org.springframework.beans.factory.annotation.Qualifier;

@Pizza("cheese")
public interface CheesePizza extends Pizza {

	public void findByIngredient();
	public void findByChicken();
}
