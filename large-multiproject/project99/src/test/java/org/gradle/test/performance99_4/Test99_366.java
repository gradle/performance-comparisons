package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_366 {
    private final Production99_366 production = new Production99_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}