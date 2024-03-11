package com.mycompany.practic1_6;


public class Seller {
    public static void modify(Phone phone){
        String usual_manufacturer = phone.getManufacturer();
        String mod_manufacturer = usual_manufacturer.replace("о","а");
        
        if (!((usual_manufacturer.startsWith("N")) || 
                usual_manufacturer.startsWith("n"))){
           mod_manufacturer = mod_manufacturer.toLowerCase();
        }
        phone.setManufacturer(mod_manufacturer);
    }
}
