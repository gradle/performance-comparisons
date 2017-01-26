package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_366 {
    private final Production72_366 production = new Production72_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}