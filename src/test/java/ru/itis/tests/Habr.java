package ru.itis.tests;

import org.junit.Test;

public class Habr extends TestBase{


    @Test
    public void editData() throws Exception {
        User user = new User("xannanov.albert@mail.ru", "ди нахуй пидор");
        login(user);
        editData(user);
    }

    @Test
    public void testLogin() {
        User user = new User("xannanov.albert@mail.ru", "ди нахуй пидор");
        login(user);
    }




}


