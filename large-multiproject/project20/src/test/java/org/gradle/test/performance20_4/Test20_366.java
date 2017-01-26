package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_366 {
    private final Production20_366 production = new Production20_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}