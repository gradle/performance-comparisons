package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_439 {
    private final Production7_439 production = new Production7_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}