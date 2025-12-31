package com.ceva.autowirebyname;

/**
 * Spring al hacer una injeccion by name, busca el bean specification y llama al metodo
 * setSpecification()
 */
public class Car {
    private Specification specification;

    public void setSpecification(Specification specification){
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details: " + specification.toString());
    }
}
