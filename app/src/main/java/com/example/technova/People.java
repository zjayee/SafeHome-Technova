package com.example.technova;

import java.util.ArrayList;
import java.util.HashMap;

public class People {
    String name;
    Integer age;
    String bio;
    HashMap<String, Boolean> preferences; //eg "kids-allowed":true
    //TODO: decide how to store location or if we want to add this feature
    //Add more properties depending on what info is in profile

    //constructor
    People(String name, Integer age, String bio){
        this.name = name;
        this.age = age;
        this.bio = bio;
        preferences = new HashMap<>();
    }


}
