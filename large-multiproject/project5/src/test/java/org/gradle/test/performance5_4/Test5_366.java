package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_366 {
    private final Production5_366 production = new Production5_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}