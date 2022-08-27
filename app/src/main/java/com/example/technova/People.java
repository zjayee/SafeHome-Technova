package com.example.technova;

import java.util.ArrayList;
import java.util.HashMap;

public class People {
    String name;
    Integer age;
    Integer profilePicture; //drawables can be stored as integers
    Integer homeCoverPicture;
    String bio;
    HashMap<String, Boolean> preferences; //eg "kids-allowed":true
    //TODO: decide how to store location or if we want to add this feature
    //Add more properties depending on what info is in profile

    //constructor
    People(String name, Integer age, String bio, Integer profilePicture, Integer homeCoverPicture){
        this.name = name;
        this.age = age;
        this.bio = bio;
        this.profilePicture = profilePicture;
        this.homeCoverPicture = homeCoverPicture;
        preferences = new HashMap<>();
    }


}
