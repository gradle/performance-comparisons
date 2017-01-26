package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_366 {
    private final Production90_366 production = new Production90_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}