package com.learningjava;

public class Horse {

    private String discipline;
    private String color;
    private String name;
    private int age;

    public void setColor(String color) {
        String validColor = color.toLowerCase();
        if (validColor.equals("bay") || validColor.equals("sorrel")) {
            this.color = color;
        } else {
            this.color = "Unknown";
        }
    }
        public String getColor() { //This is a method that can be called elsewhere to return the current color.
            return color;


        }
    }
