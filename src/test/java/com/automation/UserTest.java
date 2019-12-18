package com.automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserTest {

    private User user;

    @BeforeMethod
    public void beforeMethod(){
        user = new User("Tom", 25);
        System.out.println("beforeMethod");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
        user = null;
    }



    @Test
    public void userNameTest(){

        assertEquals(user.getName(), "Tom");
        System.out.println("userNameTest");

    }
    @Test
    public void userAgeTest(){

        System.out.println("userAgeTest");

        assertEquals(user.getAge(), 25.0);

    }


}
