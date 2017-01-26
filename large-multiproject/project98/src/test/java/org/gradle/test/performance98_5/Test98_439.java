package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_439 {
    private final Production98_439 production = new Production98_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}