package FactoryMethod;

public abstract class Pizza {

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
