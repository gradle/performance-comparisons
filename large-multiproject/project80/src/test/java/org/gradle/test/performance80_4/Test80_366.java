package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_366 {
    private final Production80_366 production = new Production80_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}