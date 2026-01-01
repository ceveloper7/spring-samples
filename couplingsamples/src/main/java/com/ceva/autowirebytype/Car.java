package com.ceva.autowirebytype;

/**
 * Spring al hacer una injeccion by type, busca un bean de tipo Specification y luego
 * llama al metodo setSpecification()
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
