package org.alma.beanfactory.pizza;

import org.alma.beanfactory.annotation.Pizza;

@Pizza
public interface PepperoniPizza extends Pizza {

	public void findByIngredient();

}
