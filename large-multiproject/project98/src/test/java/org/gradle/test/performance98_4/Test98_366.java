package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_366 {
    private final Production98_366 production = new Production98_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}