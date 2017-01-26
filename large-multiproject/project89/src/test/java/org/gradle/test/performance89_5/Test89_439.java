package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_439 {
    private final Production89_439 production = new Production89_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}