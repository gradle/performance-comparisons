package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_439 {
    private final Production79_439 production = new Production79_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}