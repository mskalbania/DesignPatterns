package FactoryMethod;

public class AmericanRestaurant implements Restaurant {
    @Override
    public Pizza getPizza(String type) {
        switch (type){
            case "Cheese":
                return new AmericanCheesePizza();
            case "Spicy":
                return new AmericanSpicyPizza();
            case "Pepperoni":
                return new AmericanPepperoniPizza();
            default:
                return null;
        }
    }
}
