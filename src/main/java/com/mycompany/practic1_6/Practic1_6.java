package com.mycompany.practic1_6;


import java.util.Scanner;

public class Practic1_6 {

    public static void main(String[] args) {      
        System.out.println("Номер варианта - 2, Нехаев Глеб Сергеевич");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите название производителя телефонного аппарата:");
        String manufacturer = scanner.nextLine();
        
        Phone phone = new Phone(manufacturer);
        Seller.modify(phone);
                
        System.out.println("Измененное название телефонного аппарата = " + phone.getManufacturer());
        
        
    }
}
