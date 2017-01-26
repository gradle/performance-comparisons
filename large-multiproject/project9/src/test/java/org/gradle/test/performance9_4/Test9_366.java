package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_366 {
    private final Production9_366 production = new Production9_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}