package com.myapp;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
class MyApplicationTests {

    @Test
    void contextLoads() {
        // Add your test cases here
    }

    @Test
    void smokeUnitTest() {
        assertFalse(1==2, "1 is not equal to 2");
    }

}