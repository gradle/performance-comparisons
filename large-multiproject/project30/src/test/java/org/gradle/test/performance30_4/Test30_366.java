package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_366 {
    private final Production30_366 production = new Production30_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}