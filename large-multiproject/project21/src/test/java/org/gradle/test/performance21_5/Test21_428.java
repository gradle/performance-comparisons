package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_428 {
    private final Production21_428 production = new Production21_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}