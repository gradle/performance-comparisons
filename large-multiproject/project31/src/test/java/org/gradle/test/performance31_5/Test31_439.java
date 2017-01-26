package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_439 {
    private final Production31_439 production = new Production31_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}