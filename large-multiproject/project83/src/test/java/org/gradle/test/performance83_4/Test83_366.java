package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_366 {
    private final Production83_366 production = new Production83_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}