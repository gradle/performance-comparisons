package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_439 {
    private final Production75_439 production = new Production75_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}