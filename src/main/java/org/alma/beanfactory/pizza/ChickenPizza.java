package org.alma.beanfactory.pizza;

import org.alma.beanfactory.annotation.Pizza;

@Pizza
public interface ChickenPizza extends Pizza {

	public void findByIngredient();

}
