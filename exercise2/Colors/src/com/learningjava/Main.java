package com.learningjava;

public class Main {

    public static void main(String[] args) {
        Colors code = new Colors(); //instantiation  using keyword new (this.(myinstantname) is actually a pointer - //
        // data structure that represents state of current class)
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider",
                "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker",
                "quran","bible","torah"});
        System.out.println("This is the Colors class");

        checkColors(colors);
    }



    static String[] colors = {"red", "blue", "yellow", "green", "pink", "black"}; //static makes colors part of the blueprint

    static void checkColors (String[] colors) {
    for (int i = 0; i < colors.length; i++) { //start at index 0 and index # of times as length of array
        System.out.println(colors[i]);
    }






        }





       /* Colors code = new Colors();
        code.colorful(new String[]{"bluebird", "red herring", "yellow bumblebee", "black spider",
                "green monkey", "pink", "great gatsby", "feeding frenzy", "black bird", "widowmaker",
                "quran", "bible", "torah"});
        System.out.println("This is the Colors class");
    }*/


    }
