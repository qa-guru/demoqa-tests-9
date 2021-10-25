package guru.qa.docs;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is the before all method!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This is the after all method!");
    }

    @BeforeEach
    void openYandex() {
        System.out.println("        open(\"ya.ru\")");
    }

    @AfterEach
    void takeScreen() {
        System.out.println("        takeScreen();");
    }

    @Test
    void firstTest() {
        System.out.println("                     first test()");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("                    second test()");
        Assertions.assertTrue(true);
    }
}
