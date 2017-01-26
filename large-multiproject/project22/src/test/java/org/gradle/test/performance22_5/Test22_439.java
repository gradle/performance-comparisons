package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_439 {
    private final Production22_439 production = new Production22_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}