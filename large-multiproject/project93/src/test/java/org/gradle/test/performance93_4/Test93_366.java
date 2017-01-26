package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_366 {
    private final Production93_366 production = new Production93_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}