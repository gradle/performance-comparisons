package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_439 {
    private final Production5_439 production = new Production5_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}