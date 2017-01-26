package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_366 {
    private final Production14_366 production = new Production14_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}