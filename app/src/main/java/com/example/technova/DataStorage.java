package com.example.technova;

import java.util.ArrayList;

//class for storing data in app
public class DataStorage {
    //singleton list of people in need
    public static ArrayList<People> needList;
    //singleton list of people offering homes
    public static ArrayList<People> helpList;

    //usertype can be two values: NEEDHELP and OFFERHELP
    public static UserType userType;

    //Adds people objects to need list
    static void populate_needList()
    {
        //TODO: Create people objects and add to needList

    }

    //adds people objects to help list
    static void populate_helpList()
    {
        //TODO: Create people objects and add to helpList
        //Example: upload/drag cover photo and pfp to drawable folder under res to use
        People person = new People("Jane", 16, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum accumsan ante ac sem pellentesque, a blandit metus cursus. ", R.drawable.pfp1, R.drawable.cover1);
        helpList.add(person);
    }
}


