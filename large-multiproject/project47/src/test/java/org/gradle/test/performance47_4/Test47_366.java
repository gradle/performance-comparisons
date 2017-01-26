package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_366 {
    private final Production47_366 production = new Production47_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}