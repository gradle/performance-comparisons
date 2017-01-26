package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_439 {
    private final Production37_439 production = new Production37_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}