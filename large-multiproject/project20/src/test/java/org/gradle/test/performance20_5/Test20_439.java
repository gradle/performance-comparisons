package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_439 {
    private final Production20_439 production = new Production20_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}