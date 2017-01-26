package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_439 {
    private final Production13_439 production = new Production13_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}