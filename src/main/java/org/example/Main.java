package org.example;

/**
 * Practice: <a href="https://www.youtube.com/watch?v=WDstsqmG4lQ">...</a>
 *
 * @author Farida Fatali
 * Creating a Telecommunication App in Java. A simple practice for Interface.
 */

public class Main {
    public static void main(String[] args) {
//        DeskPhone myPhone = new DeskPhone("1234567");
//        myPhone.powerOn();
//        myPhone.callPhone("1234567");
//        myPhone.answer();

        MobilePhone myPhone1 = new MobilePhone("123456");
        myPhone1.powerOn();
        myPhone1.callPhone("123456");
        myPhone1.answer();
    }
}