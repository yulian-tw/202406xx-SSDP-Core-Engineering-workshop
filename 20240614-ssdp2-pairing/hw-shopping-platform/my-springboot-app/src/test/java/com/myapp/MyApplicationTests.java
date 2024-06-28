package com.myapp;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = MyApplication.class, loader = AnnotationConfigContextLoader.class)
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