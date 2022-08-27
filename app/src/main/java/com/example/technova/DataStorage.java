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
        //Create people objects and add to needList
        needList = new ArrayList<>();
        People person1 = new People("Amelia Wright", 22, "Fleeing abusive husband with my 3 year old daughter. Looking for a place to stay for a few months, ideally near a preschool. ", R.drawable.ameliawright, R.drawable.cover1);
        People person2 = new People("Betty Angelo", 47, "Traveling with 2 children aged 14 and 16. Looking for a place to stay for a month at minimum. ", R.drawable.bettyangelo, R.drawable.cover1); 
        People person3 = new People("Ana Kharchenko", 31, "Traveling solo. Desperately in need a place to stay even if only for a few nights. ", R.drawable.anakharchenko, R.drawable.cover1); 
        People person4 = new People("Cindy Lee", 53, "Traveling with my 17 year old son. Looking for a place to stay for a month at minimum. ", R.drawable.cindylee, R.drawable.cover1); 
        People person5 = new People("Mehak Agarwal", 24, "Fleeing domestic abuse, traveling solo. Need a for a place to stay for a couple weeks at minimum. ", R.drawable.mehakagarwal, R.drawable.cover1); 
        People person6 = new People("Sarah Goldman", 37, "Need a place to stay with my 3 children aged 14, 12, and 8. ", R.drawable.sarahgoldman, R.drawable.cover1); 
        People person7 = new People("Janice Emory", 55, "Need a place near a hospital for me and my cat to stay for a few weeks. ", R.drawable.janiceemory, R.drawable.cover1); 
        People person8 = new People("Jada Jones", 19, "Pregnant. Looking for a place near a hospital to stay for a few months. ", R.drawable.jadajones, R.drawable.cover1); 
        needList.add(person1);
        needList.add(person2);
        needList.add(person3);
        needList.add(person4);
        needList.add(person5);
        needList.add(person6);
        needList.add(person7);
        needList.add(person8);
        //Collections.addAll(needList, person1, person2, person3, person4, person5, person6, person7, person8);
    }

    //adds people objects to help list
    static void populate_helpList()
    {
        //Create people objects and add to helpList
        helpList = new ArrayList<>();
        //Example: upload/drag cover photo and pfp to drawable folder under res to use
        People helper1 = new People("Jessica Diaz", 39, "Single mom with two kids and a dog located in Toronto. My safe home is children and pet friendly. Can house 3 for up to 4 months. ", R.drawable.jessicadiaz, R.drawable.cover1);
        People helper2 = new People("Stephanie Ryder", 25, "Hi I’m Stephanie, it’s nice to meet you! I’m a product designer based in Toronto, ON. I’m a strong advocate for womens rights - that’s why I’m thrilled to be apart of this community and share my space with you! Don’t shy away from leaving me a message! I have space for three right now. ", R.drawable.pfp1, R.drawable.cover1);
        People helper3 = new People("Lucy Lui", 28, "Photographer located in Toronto. Not pet friendly, children are welcome though. Can house 2 for up to 6 months. ", R.drawable.lucychen, R.drawable.cover1);
        People helper4 = new People("Amanda Nagerman", 46, "Elementary School Teacher located in Brampton. Can house up to 4 people for 6 months. ", R.drawable.amandanagerman, R.drawable.cover1);
        People helper5 = new People("Miranda Smith", 35, "Software engineer based in Markham. Pets and children are welcome. Can house up to 3 for as long as necessary. ", R.drawable.mirandasmith, R.drawable.cover1);
        People helper6 = new People("Julie Huang", 28, "Writer from Hamilton. Unsuitable for pets and children. Can house 1 for up to a month. ", R.drawable.janiceemory, R.drawable.cover1);
        People helper7 = new People("Zuri Johnston", 28, "Accountant based in Waterloo. Home can house 2 for up to 3 months. No pets, but children are welcomed. ", R.drawable.ameliawright, R.drawable.cover1);
        People helper8 = new People("Isabella Knight", 31, "Architect living in Ottawa. Room for one person to stay up to 6 months. ", R.drawable.sarahgoldman, R.drawable.cover1);
        helpList.add(helper1);
        helpList.add(helper2);
        helpList.add(helper3);
        helpList.add(helper4);
        helpList.add(helper5);
        helpList.add(helper6);
        helpList.add(helper7);
        helpList.add(helper8);
    }
}


