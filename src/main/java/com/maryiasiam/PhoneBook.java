package com.maryiasiam;

import java.util.ArrayList;
import java.util.Map;

public class PhoneBook {
    private User holder;
    private Map<Long, User> listOfNumbers;

    public PhoneBook(User holder, Map<Long, User> listOfNumbers) {
        this.holder = holder;
        this.listOfNumbers = listOfNumbers;
    }

    public Map<Long, User> getListOfNumbers() {
        return listOfNumbers;
    }

    public void print(long id) {
        User user = listOfNumbers.get(id);
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getPhoneNumber());
    }
}
