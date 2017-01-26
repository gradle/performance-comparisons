package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_366 {
    private final Production40_366 production = new Production40_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}