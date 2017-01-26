package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_366 {
    private final Production4_366 production = new Production4_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}