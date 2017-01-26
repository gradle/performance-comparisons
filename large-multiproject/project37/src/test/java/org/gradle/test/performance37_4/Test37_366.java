package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_366 {
    private final Production37_366 production = new Production37_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}