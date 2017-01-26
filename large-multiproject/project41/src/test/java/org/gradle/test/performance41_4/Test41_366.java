package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_366 {
    private final Production41_366 production = new Production41_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}