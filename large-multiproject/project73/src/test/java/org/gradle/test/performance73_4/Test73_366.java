package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_366 {
    private final Production73_366 production = new Production73_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}