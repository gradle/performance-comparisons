package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_455 {
    private final Production21_455 production = new Production21_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}