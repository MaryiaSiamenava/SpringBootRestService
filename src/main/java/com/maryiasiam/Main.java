package com.maryiasiam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Lily", "Smith", "79912273645");
        PhoneBook phoneBook = new PhoneBook(user, new HashMap<>());
        Map<Long, User> list = phoneBook.getListOfNumbers();
        User newUser = new User (2, "Kelly", "White", "79993364823");
        list.put(newUser.getId(), newUser);
        phoneBook.print(2);
    }
}
