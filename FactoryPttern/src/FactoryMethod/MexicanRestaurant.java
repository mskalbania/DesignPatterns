package FactoryMethod;

public class MexicanRestaurant implements Restaurant {
    @Override
    public Pizza getPizza(String type) {
        switch (type){
            case "Cheese":
                return new MexicanCheesePizza();
            case "Spicy":
                return new MexicanSpicyPizza();
            case "Pepperoni":
                return new MexicanPepperoniPizza();
            default:
                return null;
        }
    }
}
