package com.learningjava;
//class is a blueprint for an object we are going to be creating

//So far we have used only local variables that are only available in that method or code block.
//Classes allow us to create variables that are available anywhere within the class. These are
//known as class or member variables but most commonly referred to as fields.
//When creating a field for a class you also have to specify an access modifier which acts the same
//way as the access modifiers for the Class when you created it. In the case of fields, you use
// private instead of public to adhere to the principle of encapsulation. Hides fields and methods
//from public access. We are not allowing outside access to them.

public class Car {

    private int doors; //these fields (variables) are the state component for a car;
    //characteristics of a car; The state component which we are defining as fields
    private int wheels;
    private String model;
   private String engine;
    private String color;

//We are creating a template of the fields (variables) that would be part and parcel of a car
// We have created a very basic class and defined 5 fields
    //Now we need to create an object from this class that will take the blueprint we have defined
    //in the class and create an object we can start using.
    //To do that, we go back to the Main Class that was created automatically by intellij when we
    //created the new project. We will build an object there based on the Car.

    //We are going to create a method in Car to preserve the privacy of the state variables
    //remaining only available in the Car class

    // When you write a method in a Class it will attach to all of the objects you create
    //for that particular class.
    //Creating a method to update the model:


    //Other class to send string that they want to be created -
    // it will be updated in here: Create function here then you can use it in main - it will be available there.
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
            //model here is a parameter that is passed to this method -
        //but we also have first one up top that is a field - how do we distinguish between the two
        //so intellij knows which one we want to update? We want to update contents of field with the
        //contents of the parameter that was passed to us.

        //YOU TYPE this WHEN YOU ARE REFERRING TO A FIELD OF A CLASS!!!
        //this.model = model;     //accesses class field model, not method parameter
        //and then model on right side of equal is referring to the parameter in the setModel method
        //Basically, update field private String model with the contents of the parameter model that
        //was passed to us: It is a way to update the model using a method rather than trying to
        //access it directly
    }
    public String getModel() { //This is a method that can be called elsewhere to return
        //what the current model is.
        return model;
    }

}

//Validation is done in the Class which is useful - when you are setting up a class you can also set up rules for
//that class - what is valid and what is not valid. Setting it up in the class itself allows it to be inherited
//when we create an object. You can't create something somewhere else that hasn't been defined in the Car class.
//This supports the concept of encapsulation