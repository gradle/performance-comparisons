package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_439 {
    private final Production83_439 production = new Production83_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}