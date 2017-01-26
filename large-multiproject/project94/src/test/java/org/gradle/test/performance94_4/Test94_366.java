package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_366 {
    private final Production94_366 production = new Production94_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}