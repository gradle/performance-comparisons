package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_366 {
    private final Production3_366 production = new Production3_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}