package com.learningjava;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// objects: state and behaviors
        //software object stores its state in fields (variables) and expresses its behaviors
        //through methods
        //Class is a template or blueprint for creating objects
        //public class Main is a statement that creates a new class in java
        //Class is a powerful user-defined data type (not exactly true but good analogy)
        //Class Main is automatically created by intellij along with method main


        //We are going to build an object based on Class Car. we are in the main method now so
        //we are going to type a local variable local to the main method

        //Using Car for our variable - intellij recognizes it as a Class
        // but we can select it and use it as a data type for our variable. We are defining
        //an object: porsche is the keyword of type Car
        //When creating a new class, you also need to initialize it.
        Car porsche = new Car(); //We have created a new data type called porsche which is
        //of type Car. You have to do this - create a new object from template.
        //We have created an object called porsche based on the template of Car - it is now
        //one individual object we can work on
        Car chevrolet = new Car(); // we just created another object using the template Car

        Horse quarterhorse = new Horse();
        Horse thoroughbred = new Horse();

        //How do we go about accessing the state variables in Class Car? (doors, wheel, model etc.)
        //We made them private so they can't be accessed by another class. We would have to change
        //the variable we want to public.
        //When the object was created Java has added some extra functionality:
        //Put dot after porsche and will see a bunch of functions that are inherited and already
        // available. The Car Class (and any new Class you create) has inherited these from a
        // base java class. It will also show the state variables from Class Car that are public,
        //but can't show private ones.
        //porsche.model = "Carrera"; //For our object porsche we defined the state (field) model to
        // be Carrera so we have defined the type.
        //lumina.engine = "V6";
        //Making these fields public is not the best way to access them because it violates rules of
        //encapsulation so its better to make sure that functionality is restricted and placed
        //in the Car java class to preserve privacy.
        //So do this instead:
        System.out.println("Model is " + porsche.getModel()); //Model will be null because it hasn't been set
        porsche.setModel("Carerra"); //Setting model using setModel method created in Car class
        //and updating it with value Carrera - Setter
        chevrolet.setModel("Lumina");
        System.out.println("Model is " + porsche.getModel());

        System.out.println("Color is " + quarterhorse.getColor()); //Model will be null because it hasn't been set
        quarterhorse.setColor("bay"); //Setting model using setModel method created in Car class
        //and updating it with value Carrera - Setter
        chevrolet.setModel("Lumina");
        System.out.println("Color is " + quarterhorse.getColor());


    }
}


//You have to initialize classes using the new keyword