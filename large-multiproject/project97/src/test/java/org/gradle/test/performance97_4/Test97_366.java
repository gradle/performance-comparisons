package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_366 {
    private final Production97_366 production = new Production97_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}