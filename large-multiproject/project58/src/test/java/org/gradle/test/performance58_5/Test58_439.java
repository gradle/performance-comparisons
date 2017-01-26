package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_439 {
    private final Production58_439 production = new Production58_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}