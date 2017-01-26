package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_366 {
    private final Production61_366 production = new Production61_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}