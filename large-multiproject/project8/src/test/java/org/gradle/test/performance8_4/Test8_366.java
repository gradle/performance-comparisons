package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_366 {
    private final Production8_366 production = new Production8_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}