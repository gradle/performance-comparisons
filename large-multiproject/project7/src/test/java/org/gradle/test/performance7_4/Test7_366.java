package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_366 {
    private final Production7_366 production = new Production7_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}