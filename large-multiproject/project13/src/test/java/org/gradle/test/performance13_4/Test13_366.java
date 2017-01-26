package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_366 {
    private final Production13_366 production = new Production13_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}