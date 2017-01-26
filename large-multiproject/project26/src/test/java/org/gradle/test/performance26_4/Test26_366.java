package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_366 {
    private final Production26_366 production = new Production26_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}