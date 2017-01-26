package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_439 {
    private final Production25_439 production = new Production25_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}