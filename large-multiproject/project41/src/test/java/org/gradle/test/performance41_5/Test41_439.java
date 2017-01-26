package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_439 {
    private final Production41_439 production = new Production41_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}