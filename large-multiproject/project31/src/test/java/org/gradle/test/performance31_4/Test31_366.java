package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_366 {
    private final Production31_366 production = new Production31_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}