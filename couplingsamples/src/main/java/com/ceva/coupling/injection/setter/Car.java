package com.ceva.coupling.injection.setter;

public class Car {

    private Specification specification;

    public void setSpecification(Specification specification){
        this.specification = specification;
    }

    public void printDetails(){
        System.out.println("Car Details: " + specification.toString());
    }
}
