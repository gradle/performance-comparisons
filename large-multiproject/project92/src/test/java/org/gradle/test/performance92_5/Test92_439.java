package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_439 {
    private final Production92_439 production = new Production92_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}