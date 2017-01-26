package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_366 {
    private final Production63_366 production = new Production63_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}