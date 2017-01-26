package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_366 {
    private final Production50_366 production = new Production50_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}