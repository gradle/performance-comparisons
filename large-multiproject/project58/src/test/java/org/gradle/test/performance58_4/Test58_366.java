package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_366 {
    private final Production58_366 production = new Production58_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}