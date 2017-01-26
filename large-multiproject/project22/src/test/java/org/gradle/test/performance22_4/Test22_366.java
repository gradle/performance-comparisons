package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_366 {
    private final Production22_366 production = new Production22_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}