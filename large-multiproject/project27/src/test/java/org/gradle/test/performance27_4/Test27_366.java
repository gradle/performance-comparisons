package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_366 {
    private final Production27_366 production = new Production27_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}