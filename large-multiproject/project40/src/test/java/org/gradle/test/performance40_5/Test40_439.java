package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_439 {
    private final Production40_439 production = new Production40_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}